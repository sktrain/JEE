package sk.train;

import java.time.LocalDateTime;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.xml.ws.BindingType;

@WebService
//@SOAPBinding(style = Style.DOCUMENT)  //DOCUMENT ist default
public interface HelloWorldIf {

	@WebMethod						//optional
	String sayHello(String name);

	LocalDateTime sayDate();

	String sayDateasString();

}