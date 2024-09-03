package sk.train.client_coded;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import sk.train.PersonList_WS_I;
import sk.train.Person;


//Sofern auf der Client-Seite noch kein XMLTypeAdapter gesetzt ist, knirscht es!
//Dann kann es nicht 1:1 die Person-Klasse von der Server-Seite sein!
public class PersonWS_ClientCoded {

	public static void main(String[] args) throws MalformedURLException {

		//Adresse der WSDL
		URL urlwsdl = new URL("http://localhost:8080/Person_WS/PersonList_WS?wsdl");
		
		//Qualifizierte Name des Service (aus der WSDL)		
		QName qname = new QName("http://train.sk/", "PersonList_WSService");
		
		//Factory für den Service erzeugen
		Service service = Service.create(urlwsdl, qname);
		
		//Port (sprich Stub) bereit stellen
		PersonList_WS_I port = service.getPort(PersonList_WS_I.class);

		Person p = port.getPerson(0);
		System.out.println(p);
		//System.out.println(p.getBirthdate());

	}

}
