package sk.train.jpalistener;

import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

import org.jboss.logging.Logger;

public class SimpleListener {
	
	private static Logger log = Logger.getLogger(SimpleListener.class.getName());
	
	@PrePersist
	public void prePersist(Object o) {
		log.info("prePersist: " +  o);
	}
	
	@PostPersist
	public void postPersist(Object o) {
		log.info("postPersist: " +  o);
	}
	
	@PreUpdate
	public void preUpdate(Object o) {
		log.info("preUpdate: " +  o);
	}
	
	@PostUpdate
	public void postUpdate(Object o) {
		log.info("postUpdate: " +  o);
	}
	
	@PreRemove
	public void preRemove(Object o) {
		log.info("preRemove: " +  o);
	}
	
	@PostRemove
	public void postRemove(Object o) {
		log.info("postRemove: " +  o);
	}
	
	@PostLoad
	public void postLoad(Object o) {
		log.info("postLoad: " +  o);
	}
	

}
