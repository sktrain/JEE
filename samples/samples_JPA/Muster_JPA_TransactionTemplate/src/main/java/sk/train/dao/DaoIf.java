package sk.train.dao;

import jakarta.persistence.EntityManager;

public interface DaoIf {
	
	void setEntityManager(EntityManager em);
}
