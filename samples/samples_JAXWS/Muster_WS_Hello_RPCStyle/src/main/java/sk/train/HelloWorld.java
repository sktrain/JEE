package sk.train;

import java.time.LocalDateTime;

import jakarta.annotation.PostConstruct;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface = "sk.train.HelloWorldIf")
public class HelloWorld implements HelloWorldIf {
	
	private LocalDateTime ldate;
	
	@PostConstruct
	public void init() {
		ldate = LocalDateTime.now();
	}

	@Override
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@Override
	public LocalDateTime sayDate() {
		return ldate;
	}
	
	@Override
	public String sayDateasString() {
		//return ldate;
		return ldate.toString();
	}
}
