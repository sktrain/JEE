package sk.train.jpalistener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

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
