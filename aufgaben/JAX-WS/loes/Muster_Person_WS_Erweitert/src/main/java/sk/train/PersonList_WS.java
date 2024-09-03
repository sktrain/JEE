package sk.train;

import java.time.LocalDate;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.ws.WebServiceContext;

import sk.train.Person.Geschlecht;



@WebService(endpointInterface="sk.train.PersonList_WS_I")
public class PersonList_WS implements PersonList_WS_I {
	
	@Resource
	private WebServiceContext wsc;

	private Person[] personlist;
	
	public PersonList_WS() {
		super();
		
	}
	
	//@WebMethod(exclude=true)
	@PostConstruct
	public void init() {
		personlist = new Person[10];
		for (int i = 0; i < personlist.length; ++i ) {
			Person p = new Person();
			p.setName("Mustermann"+i);
			p.setBirthdate(LocalDate.of(2000,i+1,i+1));
			p.setG(Geschlecht.U);
			personlist[i] =p;
			System.out.println(p);
		}
		System.out.println("Array erzeugt");
		//printContext(); bringt hier nichts, da diese Methode nicht via WS aufgerufen wird!
	}
	
	private void printContext() {
		System.out.println("MessageContext:");
		wsc.getMessageContext().forEach( (s, o) -> System.out.println(s + " = " + o));
		
	}
	
	@Override
	public Person getPerson(int i)
	{		
		System.out.println("getPerson()");
		printContext();
		
		Person p = personlist[i];		
		return p;		
		
	}
	
	@Override
	public Person[] getPersonList() {
		System.out.println("getPersonList()");
		printContext();
		return personlist;
	}
	
	

}
