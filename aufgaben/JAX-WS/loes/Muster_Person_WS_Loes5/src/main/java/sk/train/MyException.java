package sk.train;

import jakarta.xml.ws.WebFault;

@WebFault(name="Fehler3", faultBean = "SampleBean")
public class MyException extends Exception {
	
	public MyException(String message) {
		super(message);
	}

	public MyException(Throwable cause) {
		super(cause);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(String message, Throwable cause, 
			                boolean enableSuppression, 
			                boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FaultBean getFaultInfo() {
		FaultBean fb = new FaultBean();
		fb.setInfo("Index-Werte liegen zwischen 0 - 9");
		return fb;
	}
	
	
}
