package sk.train;

import java.io.PrintWriter;
import java.io.StringWriter;

import jakarta.xml.ws.WebFault;

@WebFault(name="Fehler2")
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
		 StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			super.printStackTrace(pw);
		return details + " : " + sw.toString();
	}
	
	
}
