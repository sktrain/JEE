
package sk.train;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.4
 * 2024-09-02T21:20:31.146+02:00
 * Generated source version: 4.0.4
 */

@WebFault(name = "String", targetNamespace = "http://train.sk/")
public class KarrerException1 extends Exception {

    private java.lang.String faultInfo;

    public KarrerException1() {
        super();
    }

    public KarrerException1(String message) {
        super(message);
    }

    public KarrerException1(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public KarrerException1(String message, java.lang.String string) {
        super(message);
        this.faultInfo = string;
    }

    public KarrerException1(String message, java.lang.String string, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = string;
    }

    public java.lang.String getFaultInfo() {
        return this.faultInfo;
    }
}
