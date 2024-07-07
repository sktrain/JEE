package sk.train;

import jakarta.ejb.Remote;

@Remote
public interface HelloRemote {
	
	public abstract String sayHallo(String input);

}
