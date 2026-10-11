package app;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import beans.Musiker;

public class Starter {
	
	public static void main(String[] args) {
		
	try(SeContainer secontainer = SeContainerInitializer.newInstance().initialize()) {
			// start the container, retrieve a bean and do work with it
			
			Musiker m = secontainer.select(Musiker.class).get();
			m.perform();
			
		}
			// shuts down automatically after the try with resources block.
	}
}
