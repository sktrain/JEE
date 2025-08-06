package sk.train.client_generated;

import java.util.List;
import java.util.Map;


import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.soap.SOAPBinding;
import sk.train.generated.Person;
import sk.train.generated.PersonListWSI;
import sk.train.generated.PersonListWSService;

//auf der Client-Seite ist bei den generierten Klassen das Date in Person ein String!
//(siehe generierte Klasse). Leider hilft das nicht wirklich weiter, sofern die Server-Seite nichts schickt!
public class PersonWS_Client {
	
	public static void main(String[] args) {
		
		PersonListWSService service = new PersonListWSService();
		
		PersonListWSI proxy = service.getPersonListWSPort();
		
		Person p0 = proxy.getPerson(0);
		System.out.println(p0);
		System.out.println(p0.getBirthdate());
		
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
		BindingProvider bp = (BindingProvider) proxy;
//		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/Person_WS/PersonList_WS");
		
		System.out.println(bp.getEndpointReference());
				
		Map<String, Object> map = bp.getRequestContext();
		map.forEach(  (s, o)  -> System.out.println(s + " = " + o)     );
		
	}
	

}
