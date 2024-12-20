package sk.train;

import java.time.LocalDateTime;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorldIf {

	@WebMethod
	String sayHello(String name);

	@WebMethod
	LocalDateTime sayDate();

	@WebMethod
	String sayDateasString();

}