package beans;

import annos.GitarreType;
import ifaces.Instrument;

@GitarreType
public class Gitarre implements Instrument{
	
	public Gitarre(){
		super();
	}
	
	public void play() {
		System.out.println("Gitarrenklänge");
	}
}