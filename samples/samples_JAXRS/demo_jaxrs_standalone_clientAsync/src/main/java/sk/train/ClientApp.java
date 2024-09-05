package sk.train;

import jakarta.ws.rs.client.AsyncInvoker;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ClientApp {

	public static void main(String[] args) throws IOException {

		Client client = ClientBuilder.newClient(); // Client ist nicht per se AutoCloseable!

		try {
			WebTarget target = client.target("http://localhost:8080/demo_jaxrs_standalone_delay/rest/xml");

			AsyncInvoker builder = target.request().accept("application/xml").async();

			Future<Response> future1 = builder.get();

			Future<Person> future2 = builder.get(Person.class);

			// blockierend
			try {
				Response response = future1.get();
				// System.out.println(response.getEntity());
				System.out.println(response.getStatusInfo());
				System.out.println(response.getMediaType());
				String result = response.readEntity(String.class);
				System.out.println(result);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// blockierend mit Timeout
			Person p;
			try {
				p = future2.get(20L, TimeUnit.SECONDS);
				System.out.println("XML -> Java");
				System.out.println(p);
			} catch (InterruptedException | ExecutionException | TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// jetzt JSON mit Callback
			System.out.println("JSON");
			target = client.target("http://localhost:8080/demo_jaxrs_standalone_delay/rest/json");
			PersonCallback pc = new PersonCallback();
			Future<Response> future3 = target.request().async().get(pc);
			System.out.println(pc);
			// Person p1 = target.request().get(Person.class);
			// System.out.println(p1);

		} finally {
			client.close();
		}

	}
}
