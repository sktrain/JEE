package sk.train.client;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Random;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import sk.train.Konto;
import sk.train.KontoVerwaltungRemote;

public class Client {

	public static void main(String[] args) throws NamingException, SQLException {
		// NamensContext beschaffen, setzt entsprechende Properties voraus
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		final Context context = new InitialContext(jndiProperties);
		// final Context context = new InitialContext();

		//System.out.println("Bis hier ok");		

		// Client-seitigen Proxy beschaffen		
		KontoVerwaltungRemote stub = (KontoVerwaltungRemote) 
				context.lookup("ejb:/Muster_EJB_Kontoverwaltung/KontoVerwaltung!sk.train.KontoVerwaltungRemote");
		
		//Service aufrufen via Stub
		for (int i=0; i<100; ++i) {
			stub.transferMoney(new Random().nextInt(100), 1000);
		}
		
		for (Konto k : stub.getKonten()) {
			System.out.println(k);
		}		

	}

}
