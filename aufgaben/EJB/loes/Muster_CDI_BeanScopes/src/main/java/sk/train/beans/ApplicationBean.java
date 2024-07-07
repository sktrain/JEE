package sk.train.beans;

import java.time.LocalTime;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

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
