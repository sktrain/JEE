package sk.train;

import jakarta.xml.ws.WebFault;

@WebFault(name="Fehler3", targetNamespace = "samplenamespace", 
          messageName = "SampleMessage", faultBean = "SampleBean")
public class KarrerException3 extends Exception {
	
	public KarrerException3(String message) {
		super(message);
	}

	public KarrerException3(Throwable cause) {
		super(cause);
	}

	public KarrerException3(String message, Throwable cause) {
		super(message, cause);
	}

	public KarrerException3(String message, Throwable cause, 
			                boolean enableSuppression, 
			                boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FaultBean getFaultInfo() {
		FaultBean fb = new FaultBean();
		fb.setInfo("BeanFaultInfo");
		return fb;
	}
	
	
}
