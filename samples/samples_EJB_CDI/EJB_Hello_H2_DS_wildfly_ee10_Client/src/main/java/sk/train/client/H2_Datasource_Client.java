package sk.train.client;

import java.sql.SQLException;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import sk.train.Hello_DS_BeanRemote;

public class H2_Datasource_Client {

	public static void main(String[] args) throws NamingException, SQLException {
		// NamensContext beschaffen, setzt entsprechende Properties voraus
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		final Context context = new InitialContext(jndiProperties);
		
		System.out.println("Bis hier ok");		

		// Client-seitigen Proxy beschaffen
		// laut Standard: context.lookup("java:global/EJB_Hello_H2_DS_wildfly_ee10/Hello_DS_Bean!sk.train.Hello_DS_BeanRemote");
		// bei JBoss
		Hello_DS_BeanRemote stub = (Hello_DS_BeanRemote) 
				context.lookup("ejb:/EJB_Hello_H2_DS_wildfly_ee10/Hello_DS_Bean!sk.train.Hello_DS_BeanRemote");
				System.out.println(stub.getClass());
		//Service aufrufen via Stub
		System.out.println(stub.getDatasource());

	

	}

}
