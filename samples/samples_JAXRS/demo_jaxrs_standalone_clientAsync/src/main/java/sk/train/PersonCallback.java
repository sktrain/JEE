package sk.train;

import jakarta.ws.rs.client.InvocationCallback;
import jakarta.ws.rs.core.Response;

public class PersonCallback implements InvocationCallback<Response> {

	@Override
	public void completed(Response response) {
		if (response.getStatus() == 200) {
			String jsonstring = response.readEntity(String.class);
			System.out.println(jsonstring);
		} else {
			System.err.println("Response-Status: " + response.getStatus());
		}
		
	}

	@Override
	public void failed(Throwable throwable) {
		throwable.printStackTrace();		
	}

}
