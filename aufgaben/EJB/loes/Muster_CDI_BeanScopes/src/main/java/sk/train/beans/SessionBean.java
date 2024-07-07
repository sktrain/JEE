package sk.train.beans;

import java.time.LocalTime;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import java.io.Serializable;

@SessionScoped()
public class SessionBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private RequestBean rb;
	
	private LocalTime created;

	public SessionBean() {
		//TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		created = LocalTime.now();
	}

	@Override
	public String toString() {
		return "SessionBean [Created: " + created + " toString()=" + super.toString() + " My Bean: " + rb + "]";
	}
	
	

}
