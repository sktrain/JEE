package sk.train.client;

import java.time.LocalDateTime;

import sk.train.gen.HelloWorld;
import sk.train.gen.HelloWorldService;

public class Client {

	public static void main(String[] args) throws InterruptedException {

		HelloWorldService service = new HelloWorldService();
		
		HelloWorld hw = service.getPort(HelloWorld.class);
		
		String answer = hw.sayHello("Otto");
		System.out.println(answer);
		
		//funktioniert nicht, da nichts kommt LocalDate keinen entsprechenden Konstruktor ambietet:
		//System.out.println(hw.sayDate());
		
		System.out.println(hw.sayDateasString());
		Thread.sleep(1000);
		LocalDateTime ld = LocalDateTime.parse(hw.sayDateasString());
		System.out.println(ld);
		
		hw.init();
		System.out.println(hw.sayDateasString());

	}

}
