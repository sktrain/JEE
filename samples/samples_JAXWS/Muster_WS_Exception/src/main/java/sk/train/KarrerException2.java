package sk.train;

import jakarta.xml.ws.WebFault;

@WebFault(name="Exception2", targetNamespace="http://train.sk/")
public class KarrerException2 extends Exception {
	
	private String details;

	public KarrerException2(String message, String details) {
		super(message);
		this.details = details;
	}

	public KarrerException2(Throwable cause, String details) {
		super(cause);
		this.details = details;
	}

	public KarrerException2(String message, Throwable cause, String details) {
		super(message, cause);
		this.details = details;
	}

	public KarrerException2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,
			String details) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.details = details;
	}

	public String getFaultInfo() {
		return details + "\n" + super.getStackTrace();
	}
	
	
}
