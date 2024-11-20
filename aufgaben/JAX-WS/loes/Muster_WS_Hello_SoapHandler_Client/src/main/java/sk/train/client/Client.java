package sk.train.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import sk.train.HelloWorldIf;


public class Client {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:8080/Muster_WS_Hello_SOAPHandler/HelloWorld?wsdl");
		
		QName qname = new QName("http://train.sk/", "HelloWorldService");
		
		Service service = Service.create(url, qname);
		
		//Handler setzen
		service.setHandlerResolver(new MyHandlerResolver());
		
		//jetzt übliche Verarbeitung
		
		HelloWorldIf hw = service.getPort(HelloWorldIf.class);
		
		String answer = hw.sayHello("Otto");
		System.out.println(answer);
		
		System.out.println(hw.sayDateasString());
		LocalDateTime ld = LocalDateTime.parse(hw.sayDateasString());
		System.out.println(ld);
		
		
		
	}

}

