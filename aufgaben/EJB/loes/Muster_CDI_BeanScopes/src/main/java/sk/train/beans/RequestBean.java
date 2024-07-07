package sk.train.beans;

import java.time.LocalTime;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class RequestBean {
	
	private LocalTime created;

	public RequestBean() {
		//TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		created = LocalTime.now();
	}

	@Override
	public String toString() {
		return "RequestBean [Created: " + created + " toString()=" + super.toString() + "]";
	}
	
	

}
