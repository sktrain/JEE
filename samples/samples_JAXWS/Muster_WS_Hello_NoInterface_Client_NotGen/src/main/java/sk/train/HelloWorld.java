package sk.train;

import java.time.LocalDate;

import jakarta.jws.WebService;


@WebService  //ist notwendig beim Java 8 Client
public interface HelloWorld {
	
	public void init();


	public String sayHello(String name) ;
	
	public LocalDate sayDate();
	
	public String sayDateasString();
}
