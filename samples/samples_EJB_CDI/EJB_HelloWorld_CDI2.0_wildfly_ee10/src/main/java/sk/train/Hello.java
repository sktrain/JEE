package sk.train;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

/**
 * Session Bean implementation class GeneraliHello
 */
@Stateless
public class Hello implements HelloRemote {
	
	@Inject
	private Message bohne;
	
    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }    

	@Override
	public String sayHallo(String input) {
		return bohne.produce() + input;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init-Method executed by Thread: " + Thread.currentThread());
	}

}
