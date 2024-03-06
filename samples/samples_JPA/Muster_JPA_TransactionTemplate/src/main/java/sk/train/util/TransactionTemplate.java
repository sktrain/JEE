package sk.train.util;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import sk.train.dao.DaoIf;
import sk.train.model.Employee;

public class TransactionTemplate {

	@FunctionalInterface
	public interface Consumer extends java.util.function.Consumer<EntityManager> {
	}
	
	@FunctionalInterface
	public interface Function<T> extends java.util.function.Function<EntityManager, T> {
	}
	
	private final EntityManagerFactory factory;
	
	private DaoIf dao;

	private final boolean log;

	public TransactionTemplate(EntityManagerFactory factory, DaoIf dao, boolean log) {
		this.factory = factory;
		this.dao = dao;
		this.log = log;
	}

	public void run(Consumer callback) {
		final EntityManager manager = this.factory.createEntityManager();
		dao.setEntityManager(manager);
		final EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			callback.accept(manager);
			this.log(">>> COMMIT");
			transaction.commit();
			this.log("<<< COMMIT");
		}
		catch (final RuntimeException e) {
			this.log(e.toString());
			if (transaction.isActive()) {
				this.log(">>> ROLLBACK");
				transaction.rollback();
				this.log("<<< ROLLBACK");
			}
			throw e;
		}
		finally {
			manager.close();
		}
	}

	public <T> T runWithResult(Function<T> function) {
		final EntityManager manager = this.factory.createEntityManager();
		dao.setEntityManager(manager);
		final EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			final T result = function.apply(manager);
			this.log(">>> COMMIT");
			transaction.commit();
			this.log("<<< COMMIT");
			return result;
		}
		catch (final RuntimeException e) {
			this.log(e.toString());
			if (transaction.isActive()) {
				this.log(">>> ROLLBACK");
				transaction.rollback();
				this.log("<<< ROLLBACK");
			}
			throw e;
		}
		finally {
			manager.close();
		}
	}

	private void log(String name) {
		if (this.log)
			System.out.println(name);
	}


}
