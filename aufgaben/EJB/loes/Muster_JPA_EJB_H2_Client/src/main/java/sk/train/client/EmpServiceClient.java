package sk.train.client;

import java.sql.SQLException;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import sk.train.service.EmpServiceRemote;

public class EmpServiceClient {

	public static void main(String[] args) throws NamingException, SQLException {
		// NamensContext beschaffen, setzt entsprechende Properties voraus
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		final Context context = new InitialContext(jndiProperties);
		//final Context context = new InitialContext();

		System.out.println("Bis hier ok");		

		// Client-seitigen Proxy beschaffen
		
		EmpServiceRemote stub = (EmpServiceRemote) 
				context.lookup("ejb:/Muster_JPA_EJB_H2/EmpService!sk.train.service.EmpServiceRemote");
		
		//Service aufrufen via Stub
		//leider verwendet Hibernate unter der Haube interne Klassen bei den Collections und da die 
		//serialisierten Objekte solche Collectiontypen verwenden führt das ohne Hibernate-Einbindung
		//auf der Client-Seite zur ClassNotFoundException
		System.out.println(stub.readEmp(100L).getLastName());   //King
		stub.getAllDeps().forEach(d -> System.out.println(d.getDepartmentName()));
		

	}

}
