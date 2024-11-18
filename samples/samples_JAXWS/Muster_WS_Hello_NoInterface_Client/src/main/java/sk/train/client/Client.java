package sk.train.client;

import java.time.LocalDateTime;

import sk.train.gen.HelloWorld;
import sk.train.gen.HelloWorldService;

public class Client {

	public static void main(String[] args) {

		HelloWorldService service = new HelloWorldService();
		
		HelloWorld hw = service.getPort(HelloWorld.class);
		
		String answer = hw.sayHello("Otto");
		System.out.println(answer);
		
		//funktioniert nicht, da nichts kommt, weil LocalDate keinen entsprechenden Konstruktor anbietet:
		System.out.println(hw.sayDate());
		
		System.out.println(hw.sayDateasString());
		LocalDateTime ld = LocalDateTime.parse(hw.sayDateasString());
		System.out.println(ld);
		
		hw.init();
		System.out.println(hw.sayDateasString());

	}

}
