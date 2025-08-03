package sk.train.notgenerated;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import sk.train.HelloWorldIf;


public class Client {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:8080/Hello_WS_DOCStyle/HelloWorld?wsdl");
		
		QName qname = new QName("http://train.sk/", "HelloWorldService");
		
		Service service = Service.create(url, qname);
		
		HelloWorldIf hw = service.getPort(HelloWorldIf.class);
		
		String answer = hw.sayHello("Otto");
		System.out.println(answer);
		
		//funktioniert nicht, da nichts kommt (LocalDate bietet keinen entsprechenden Konstruktor an):
		//System.out.println(hw.sayDate());
		
		System.out.println(hw.sayDateasString());
		LocalDateTime ld = LocalDateTime.parse(hw.sayDateasString());
		System.out.println(ld);
		

	}

}
