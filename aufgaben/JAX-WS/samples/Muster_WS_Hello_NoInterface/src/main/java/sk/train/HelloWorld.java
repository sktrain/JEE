package sk.train;

import java.time.LocalDateTime;

import jakarta.annotation.PostConstruct;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloWorld {
	
	private LocalDateTime ldate;
	
	//@WebMethod(exclude = true)
	@PostConstruct
	public void init() {
		ldate = LocalDateTime.now();
	}

	@WebMethod
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod
	public LocalDateTime sayDate() {
		return ldate;
	}
	
	@WebMethod
	public String sayDateasString() {
		//return ldate;
		return ldate.toString();
	}
}
