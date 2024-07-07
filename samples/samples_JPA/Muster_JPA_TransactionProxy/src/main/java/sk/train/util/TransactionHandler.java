package sk.train.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class TransactionHandler implements InvocationHandler {

	@SuppressWarnings("unchecked")
	public static <T> T createProxy(EntityManagerFactory factory, Class<T> iface, Object realObject) {
		return (T) Proxy.newProxyInstance(
				Thread.currentThread().getContextClassLoader(),
				new Class[] { iface }, 
				new TransactionHandler(factory, realObject)); 
	}
	
	private final EntityManagerFactory factory;
	private final Object target;
	
	public TransactionHandler(EntityManagerFactory factory, Object target) {
		this.factory = factory;
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (EntityManagerThreadLocal.isEntityManagerBound()) {
			try {
				return method.invoke(this.target, args);
			}
			catch(final Throwable t) {
				if (t instanceof InvocationTargetException)
					throw ((InvocationTargetException)t).getCause();
				throw t;
			}
		}
		
		final EntityManager manager = this.factory.createEntityManager();

		printHeader(method.getName() + Integer.toHexString(System.identityHashCode(manager)));
		
		EntityManagerThreadLocal.setEntityManager(manager);
		final EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			final Object result = method.invoke(this.target, args);
			transaction.commit();
			return result;
		}
		catch (final Throwable t) {
			if (transaction.isActive())
				transaction.rollback();
			if (t instanceof InvocationTargetException)
				throw ((InvocationTargetException)t).getCause();
			throw t;
		}
		finally {
			manager.close();
			EntityManagerThreadLocal.removeEntityManager();
		}
	}

	private static void printHeader(String name) {
		final String line = "----------------------------------";
		System.out.println(line);
		System.out.println(name);
		System.out.println(line);
	}
}
