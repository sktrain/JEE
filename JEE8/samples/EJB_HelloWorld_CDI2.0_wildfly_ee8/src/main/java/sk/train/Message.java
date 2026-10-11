package sk.train;

import javax.enterprise.context.Dependent;

@Dependent
public class Message {
	
	public String produce() {
		return "Huhu ";
	}

}
