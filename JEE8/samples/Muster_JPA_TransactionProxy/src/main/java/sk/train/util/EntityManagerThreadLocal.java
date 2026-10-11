package sk.train.util;

import javax.persistence.EntityManager;

public class EntityManagerThreadLocal {

	private final static ThreadLocal<EntityManager> managers = new ThreadLocal<EntityManager>();
	
	public static EntityManager getCurrentEntityManager() {
		EntityManager manager = managers.get();
		if (manager == null)
			throw new RuntimeException("missing currentEntityManager");
		return manager;
	}
	public static void setEntityManager(EntityManager manager) {
		if (managers.get() != null)
			throw new RuntimeException("EntityManager already bound to current thread");
		managers.set(manager);
	}
	public static void removeEntityManager() {
		EntityManager manager = managers.get();
		if (manager == null)
			throw new RuntimeException("no EntityManager bound to current thread");
		managers.remove();
	}
	public static boolean isEntityManagerBound() {
		return managers.get() != null;
	}
}
