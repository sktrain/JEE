package sk.train;

public class EmployeeException extends RuntimeException {
    public EmployeeException() {
        super();
    }

    public EmployeeException(Throwable cause) {
        super(cause);
    }

    public EmployeeException(String message) {
        super(message);
    }

    public EmployeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}
