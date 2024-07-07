package sk.train;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Message {
	
	public String produce() {
		return "Huhu ";
	}

}
