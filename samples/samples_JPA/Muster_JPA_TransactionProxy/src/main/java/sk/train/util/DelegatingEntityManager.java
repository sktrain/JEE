package sk.train.util;

import java.util.List;
import java.util.Map;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.metamodel.Metamodel;


@SuppressWarnings("rawtypes")
public class DelegatingEntityManager implements EntityManager {

	// Singleton
	private static final DelegatingEntityManager instance = new DelegatingEntityManager();

	public static DelegatingEntityManager getInstance() {
		return instance;
	}

	private DelegatingEntityManager() {
	}

	@Override
	public void clear() {
		EntityManagerThreadLocal.getCurrentEntityManager().clear();
	}

	@Override
	public void close() {
		EntityManagerThreadLocal.getCurrentEntityManager().close();
	}

	@Override
	public boolean contains(Object obj) {
		return EntityManagerThreadLocal.getCurrentEntityManager().contains(obj);
	}

	@Override
	public Query createNamedQuery(String jpql) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createNamedQuery(jpql);
	}

	@Override
	public <T> TypedQuery<T> createNamedQuery(String obj, Class<T> cls) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createNamedQuery(obj, cls);
	}

	@Override
	public Query createNativeQuery(String jpql) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createNativeQuery(jpql);
	}

	@Override
	public Query createNativeQuery(String jpql, Class cls) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createNativeQuery(jpql, cls);
	}

	@Override
	public Query createNativeQuery(String jpql, String s) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createNativeQuery(jpql, s);
	}

	@Override
	public Query createQuery(String jpql) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createQuery(jpql);
	}

	@Override
	public <T> TypedQuery<T> createQuery(String jpql, Class<T> cls) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createQuery(jpql, cls);
	}

	@Override
	public void detach(Object obj) {
		EntityManagerThreadLocal.getCurrentEntityManager().detach(obj);
	}

	@Override
	public <T> T find(Class<T> cls, Object key) {
		return EntityManagerThreadLocal.getCurrentEntityManager().find(cls, key);
	}

	@Override
	public <T> T find(Class<T> cls, Object key, Map<String, Object> map) {
		return EntityManagerThreadLocal.getCurrentEntityManager().find(cls, key, map);
	}

	@Override
	public <T> T find(Class<T> cls, Object key, LockModeType lock) {
		return EntityManagerThreadLocal.getCurrentEntityManager().find(cls, key, lock);
	}

	@Override
	public <T> T find(Class<T> cls, Object key, LockModeType lock, Map<String, Object> map) {
		return EntityManagerThreadLocal.getCurrentEntityManager().find(cls, key, lock, map);
	}

	@Override
	public void flush() {
		EntityManagerThreadLocal.getCurrentEntityManager().flush();
	}

	@Override
	public CriteriaBuilder getCriteriaBuilder() {
		return EntityManagerThreadLocal.getCurrentEntityManager().getCriteriaBuilder();
	}

	@Override
	public Object getDelegate() {
		return EntityManagerThreadLocal.getCurrentEntityManager().getDelegate();
	}

	@Override
	public EntityManagerFactory getEntityManagerFactory() {
		return EntityManagerThreadLocal.getCurrentEntityManager().getEntityManagerFactory();
	}

	@Override
	public FlushModeType getFlushMode() {
		return EntityManagerThreadLocal.getCurrentEntityManager().getFlushMode();
	}

	@Override
	public LockModeType getLockMode(Object obj) {
		return EntityManagerThreadLocal.getCurrentEntityManager().getLockMode(obj);
	}

	@Override
	public Metamodel getMetamodel() {
		return EntityManagerThreadLocal.getCurrentEntityManager().getMetamodel();
	}

	@Override
	public Map<String, Object> getProperties() {
		return EntityManagerThreadLocal.getCurrentEntityManager().getProperties();
	}

	@Override
	public <T> T getReference(Class<T> cls, Object key) {
		return EntityManagerThreadLocal.getCurrentEntityManager().getReference(cls, key);
	}

	@Override
	public EntityTransaction getTransaction() {
		return EntityManagerThreadLocal.getCurrentEntityManager().getTransaction();
	}

	@Override
	public boolean isOpen() {
		return EntityManagerThreadLocal.getCurrentEntityManager().isOpen();
	}

	@Override
	public void joinTransaction() {
		EntityManagerThreadLocal.getCurrentEntityManager().joinTransaction();
	}

	@Override
	public void lock(Object obj, LockModeType lock) {
		EntityManagerThreadLocal.getCurrentEntityManager().lock(obj, lock);
	}

	@Override
	public void lock(Object obj, LockModeType lock, Map<String, Object> map) {
		EntityManagerThreadLocal.getCurrentEntityManager().lock(obj, lock, map);
	}

	@Override
	public <T> T merge(T obj) {
		return EntityManagerThreadLocal.getCurrentEntityManager().merge(obj);
	}

	@Override
	public void persist(Object obj) {
		EntityManagerThreadLocal.getCurrentEntityManager().persist(obj);
	}

	@Override
	public void refresh(Object obj) {
		EntityManagerThreadLocal.getCurrentEntityManager().refresh(obj);
	}

	@Override
	public void refresh(Object obj, Map<String, Object> map) {
		EntityManagerThreadLocal.getCurrentEntityManager().refresh(obj, map);
	}

	@Override
	public void refresh(Object obj, LockModeType lock) {
		EntityManagerThreadLocal.getCurrentEntityManager().refresh(obj, lock);
	}

	@Override
	public void refresh(Object obj, LockModeType lock, Map<String, Object> map) {
		EntityManagerThreadLocal.getCurrentEntityManager().refresh(obj, lock, map);
	}

	@Override
	public void remove(Object obj) {
		EntityManagerThreadLocal.getCurrentEntityManager().remove(obj);
	}

	@Override
	public void setFlushMode(FlushModeType flush) {
		EntityManagerThreadLocal.getCurrentEntityManager().setFlushMode(flush);
	}

	@Override
	public void setProperty(String name, Object value) {
		EntityManagerThreadLocal.getCurrentEntityManager().setProperty(name, value);
	}

	@Override
	public <T> T unwrap(Class<T> cls) {
		return EntityManagerThreadLocal.getCurrentEntityManager().unwrap(cls);
	}

	@Override
	public <T> EntityGraph<T> createEntityGraph(Class<T> arg0) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createEntityGraph(arg0);
	}

	@Override
	public EntityGraph<?> createEntityGraph(String arg0) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createEntityGraph(arg0);
	}

	@Override
	public StoredProcedureQuery createNamedStoredProcedureQuery(String arg0) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createNamedStoredProcedureQuery(arg0);
	}

	@Override
	public StoredProcedureQuery createStoredProcedureQuery(String arg0) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createStoredProcedureQuery(arg0);
	}

	@Override
	public StoredProcedureQuery createStoredProcedureQuery(String arg0, Class... arg1) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createStoredProcedureQuery(arg0, arg1);
	}

	@Override
	public StoredProcedureQuery createStoredProcedureQuery(String arg0, String... arg1) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createStoredProcedureQuery(arg0, arg1);
	}

	@Override
	public EntityGraph<?> getEntityGraph(String arg0) {
		return EntityManagerThreadLocal.getCurrentEntityManager().getEntityGraph(arg0);
	}

	@Override
	public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> arg0) {
		return EntityManagerThreadLocal.getCurrentEntityManager().getEntityGraphs(arg0);
	}

	@Override
	public boolean isJoinedToTransaction() {
		return EntityManagerThreadLocal.getCurrentEntityManager().isJoinedToTransaction();
	}

	@Override
	public <T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createQuery(criteriaQuery);
	}

	@Override
	public Query createQuery(CriteriaUpdate updateQuery) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createQuery(updateQuery);
	}

	@Override
	public Query createQuery(CriteriaDelete deleteQuery) {
		return EntityManagerThreadLocal.getCurrentEntityManager().createQuery(deleteQuery);
	}

	
}
