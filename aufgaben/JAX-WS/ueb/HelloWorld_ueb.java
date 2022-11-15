/* Als WebService bereit zu stellen, ein Interface wird nicht unbedingt benötigt */

package sk.train;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

public class HelloWorld_ueb {
	
	private LocalDateTime ldate;
	
	@PostConstruct
	public void init() {
		ldate = LocalDateTime.now();
	}

	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	public LocalDateTime sayDate() {
		return ldate;
	}
	
	public String sayDateasString() {
		//return ldate;
		return ldate.toString();
	}
}
