package sk.train.client;



import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import sk.train.HelloRemote;

public class HelloEJBClient {

	public static void main(String[] args) throws NamingException {
		// NamensContext beschaffen, setzt entsprechende Properties voraus
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		final Context context = new InitialContext(jndiProperties);
		
		

		// Client-seitigen Proxy beschaffen
		
		HelloRemote stub = (HelloRemote) 
				context.lookup("ejb:/EJB_HelloWorld_CDI2.0_wildfly_ee10/Hello!sk.train.HelloRemote");
		
		System.out.println(stub.sayHallo("Stephan"));
		
		// Wie folgende Ausgabe zeigt, ist das stub-Objekt ein Proxy,
		// der  für uns die Netzwerkkommunikation via RMi erledigt
		System.out.println(stub.getClass());
		

	}

}
