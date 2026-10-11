package sk.train.beans;

import java.time.LocalTime;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ApplicationBean {
	
	@Inject
	private SessionBean sb;
	
	private LocalTime created;

	public ApplicationBean() {
		//TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		created = LocalTime.now();
	}

	@Override
	public String toString() {
		return "ApplicationBean [Created: " + created + " toString()=" + super.toString() + " My Bean: " + sb + "]";
	}
	
	

}
