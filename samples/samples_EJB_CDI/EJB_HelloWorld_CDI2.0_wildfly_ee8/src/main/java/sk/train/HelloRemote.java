package sk.train;

import javax.ejb.Remote;

@Remote
public interface HelloRemote {
	
	public abstract String sayHallo(String input);

}
