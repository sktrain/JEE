
package sk.train;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.4
 * 2024-11-18T06:26:54.712+01:00
 * Generated source version: 4.0.4
 */

@WebFault(name = "Exception2", targetNamespace = "http://train.sk/")
public class KarrerException2 extends Exception {

    private java.lang.String faultInfo;

    public KarrerException2() {
        super();
    }

    public KarrerException2(String message) {
        super(message);
    }

    public KarrerException2(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public KarrerException2(String message, java.lang.String exception2) {
        super(message);
        this.faultInfo = exception2;
    }

    public KarrerException2(String message, java.lang.String exception2, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = exception2;
    }

    public java.lang.String getFaultInfo() {
        return this.faultInfo;
    }
}
