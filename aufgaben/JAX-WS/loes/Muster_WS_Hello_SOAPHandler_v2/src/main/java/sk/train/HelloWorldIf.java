package sk.train;

import java.time.LocalDateTime;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
//@SOAPBinding(style = Style.DOCUMENT)  //DOCUMENT ist default
public interface HelloWorldIf {

	String sayHello(String name);

	String sayDateasString();

}