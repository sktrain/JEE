package sk.train.gen;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.10
 * 2022-08-15T23:38:13.205+02:00
 * Generated source version: 3.3.10
 *
 */
@WebService(targetNamespace = "http://train.sk/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod
    @RequestWrapper(localName = "init", targetNamespace = "http://train.sk/", className = "sk.train.gen.Init")
    @ResponseWrapper(localName = "initResponse", targetNamespace = "http://train.sk/", className = "sk.train.gen.InitResponse")
    public void init()
;

    @WebMethod
    @RequestWrapper(localName = "sayDateasString", targetNamespace = "http://train.sk/", className = "sk.train.gen.SayDateasString")
    @ResponseWrapper(localName = "sayDateasStringResponse", targetNamespace = "http://train.sk/", className = "sk.train.gen.SayDateasStringResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayDateasString()
;

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://train.sk/", className = "sk.train.gen.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://train.sk/", className = "sk.train.gen.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "sayDate", targetNamespace = "http://train.sk/", className = "sk.train.gen.SayDate")
    @ResponseWrapper(localName = "sayDateResponse", targetNamespace = "http://train.sk/", className = "sk.train.gen.SayDateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public sk.train.gen.LocalDateTime sayDate()
;
}
