package sk.train;

import java.time.LocalDate;

import jakarta.jws.WebService;

@WebService  //ist notwendig beim Java Client
public interface HelloWorld {
	
//	
	public void init();


//	@WebMethod
	public String sayHello(String name) ;
	
//	@WebMethod
	public LocalDate sayDate();
	
	public String sayDateasString();
}
