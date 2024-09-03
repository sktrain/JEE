package sk.train;

public class KarrerException1 extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String details;
	
	public KarrerException1(String reason, String details) {
		super(reason);
		this.details = details;
	}
	
	public String getFaultInfo() {
		return details;
	}

}
