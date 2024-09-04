package sk.train;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;

public class ClientApp {

    public static void main(String[] args) throws IOException {


        Client client = ClientBuilder.newClient();  //Client ist nicht per se AutoCloseable!

        try {
            WebTarget target = client.target("http://localhost:8080/demo_jaxrs_standalone/rest/xml");

            Invocation.Builder builder = target.request();
            builder = builder.accept("application/xml");

            Response response = builder.get();

            //System.out.println(response.getEntity());
            System.out.println(response.getStatusInfo());
            System.out.println(response.getMediaType());
            String result = response.readEntity(String.class);
            System.out.println(result);

            //oder kurz
            result = builder.get(String.class);
            System.out.println(result);

            //unmarshalling zu Person-Object
            System.out.println("XML -> Java");
            Person p = builder.get(Person.class);
            System.out.println(p);

            //jetzt JSON
            System.out.println("JSON -> Java");
            target = client.target("http://localhost:8080/demo_jaxrs_standalone/rest/json");
            String jsonstring = target.request().get(String.class);
            System.out.println(jsonstring);
//            Person p1 = target.request().get(Person.class);
//            System.out.println(p1);

        } finally{
            client.close();
        }

    }
}


