package sk.train;

public class EmployeeExistsException extends EmployeeException {

	private static final long serialVersionUID = 1L;

	public EmployeeExistsException() {
		super();
	}

	public EmployeeExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmployeeExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeExistsException(String message) {
		super(message);
	}

	public EmployeeExistsException(Throwable cause) {
		super(cause);
	}
	
	

}
