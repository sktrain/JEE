package sk.train.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import sk.train.HelloWorld;


public class Client {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:8080/Hello_WS/HelloWorld?wsdl");
		
		QName qname = new QName("http://train.sk/", "HelloWorldService");
		
		Service service = Service.create(url, qname);
		
		HelloWorld hw = service.getPort(HelloWorld.class);
		
		String answer = hw.sayHello("Otto");
		System.out.println(answer);
		
		//funktioniert nicht, da nichts kommt LocalDate keinen entsprechenden Konstruktor ambietet:
		//System.out.println(hw.sayDate());
		
		System.out.println(hw.sayDateasString());
		LocalDateTime ld = LocalDateTime.parse(hw.sayDateasString());
		System.out.println(ld);
		
		hw.init();
		System.out.println(hw.sayDateasString());
		
		
	}

}

