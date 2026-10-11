package sk.train.sample;

import java.util.function.Consumer;

import javax.inject.Inject;

public class TestClass {
	
	@Inject
	private String s;
	
	@Inject
	private Consumer<String> cs;

	@Override
	public String toString() {
		 cs.accept("Hugo");
		return "TestClass [s=" + s + ", cs=" + cs + "]" ;
	}
	
	

}
