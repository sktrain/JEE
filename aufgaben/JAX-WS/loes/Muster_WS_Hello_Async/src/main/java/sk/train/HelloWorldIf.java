package sk.train;

import java.time.LocalDateTime;
import jakarta.jws.WebService;

@WebService
public interface HelloWorldIf {

	String sayHello(String name);

	LocalDateTime sayDate();

	String sayDateasString();

}