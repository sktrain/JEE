package sk.train;

import java.io.IOException;

import jakarta.jws.WebService;

@WebService
public class ExceptionService {
	
	public int sayInt(int i) throws IOException, KarrerException1, KarrerException2, KarrerException3  {
		if (i == 1) throw new RuntimeException("das war eine 1");
		if (i == 2) throw new IOException("das war eine 2");
		if (i == 3) throw new KarrerException1("das war eine 3");
		if (i == 4)	throw new KarrerException2("das war eine 4", "hier kommen die Details 4");
		if (i == 5) throw new KarrerException3("das war eine 5");
		return i;
		
	}

}
