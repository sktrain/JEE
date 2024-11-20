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
	    try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return "Hello " + name + "!";
	}
	
	@Override
	public LocalDateTime sayDate() {
		return ldate;
	}
	
	@Override
	public String sayDateasString() {
		 try {
				Thread.sleep(10_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return ldate.toString();
	}
}
