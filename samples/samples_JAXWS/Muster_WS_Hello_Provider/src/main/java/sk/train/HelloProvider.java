package sk.train;

import javax.xml.transform.Source;

import jakarta.xml.ws.Provider;
import jakarta.xml.ws.WebServiceProvider;

@WebServiceProvider( )
public class HelloProvider implements Provider<Source> {

   	@Override
	public Source invoke(Source request) {
   		System.out.println("invoke mit request:");
   		System.out.println(request);
		return request;
	}
}
