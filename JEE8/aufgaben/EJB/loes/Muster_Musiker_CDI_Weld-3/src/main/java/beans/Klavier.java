package beans;


import annos.KlavierType;
import ifaces.Instrument;

@KlavierType
public class Klavier implements Instrument{
	
	public Klavier(){
		super();
	}
	
	public void play() {
		System.out.println("Klavierklänge von " + this);
	}
}

