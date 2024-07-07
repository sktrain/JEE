package beans;


import jakarta.inject.Inject;

import annos.GitarreType;
import ifaces.Instrument;
import ifaces.Performer;

public class Musiker implements Performer{	
	
//	@Inject 
//	@GitarreType
	private Instrument i;
	
	@Inject 
	public Musiker(@GitarreType Instrument i) { this.i = i; }
	
	public void perform() {
		System.out.println("Performamce von " + this);
		i.play();
	}
}
