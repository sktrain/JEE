package sk.train.sample;

import java.util.function.Consumer;

import javax.enterprise.inject.Produces;

public class MyProducer {
	
	@Produces
	private String s = "Stephan";
	
	
	@Produces
	public Consumer<String> getConsumer(){
		return (String s) -> System.out.println(s);
	}

}
