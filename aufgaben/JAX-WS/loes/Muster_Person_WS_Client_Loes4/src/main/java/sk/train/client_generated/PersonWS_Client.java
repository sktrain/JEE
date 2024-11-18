package sk.train.client_generated;

import java.util.List;
import java.util.Map;


import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.soap.SOAPBinding;
import sk.train.generated.Person;
import sk.train.generated.PersonListWSI;
import sk.train.generated.PersonListWSService;

//auf der Client-Seite ist noch kein XMLTypeAdapter gesetzt, somit ist das Date in Person ein String!
//siehe generierte Klasse.
public class PersonWS_Client {
	
	public static void main(String[] args) {
		
		PersonListWSService service = new PersonListWSService();
		
		PersonListWSI proxy = service.getPersonListWSPort();
		
		BindingProvider bp = (BindingProvider) proxy;
//		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/Person_WS/PersonList_WS");
		
		List<Person> pl = proxy.getPersonList();
		
		pl.forEach(System.out::println);
		
		//Was passiert bei falschem Index?
//		try {
//			Person p = proxy.getPerson(20);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.err.println(e.getClass());
//			System.err.println(e);
//		}
		
		
		//BindingProvider-Funktionalitaet
		
		System.out.println(bp.getEndpointReference());
		
//		Map<String, Object> map = bp.getRequestContext();
//		map.forEach(  (s, o)  -> System.out.println(s + " = " + o)     );

	}
	

}
