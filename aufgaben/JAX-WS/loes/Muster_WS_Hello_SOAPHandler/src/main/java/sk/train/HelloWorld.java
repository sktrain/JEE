package sk.train;

import java.time.LocalDateTime;

import jakarta.annotation.PostConstruct;
import jakarta.jws.HandlerChain;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface = "sk.train.HelloWorldIf")
@HandlerChain(file = "../../handlers.xml")
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
	public String sayDateasString() {
		//return ldate;
		return ldate.toString();
	}
}
