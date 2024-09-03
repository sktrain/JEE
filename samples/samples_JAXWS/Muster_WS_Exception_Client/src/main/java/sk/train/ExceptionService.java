package sk.train;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.4
 * 2024-09-02T21:20:31.206+02:00
 * Generated source version: 4.0.4
 *
 */
@WebService(targetNamespace = "http://train.sk/", name = "ExceptionService")
@XmlSeeAlso({ObjectFactory.class})
public interface ExceptionService {

    @WebMethod
    @RequestWrapper(localName = "sayInt", targetNamespace = "http://train.sk/", className = "sk.train.SayInt")
    @ResponseWrapper(localName = "sayIntResponse", targetNamespace = "http://train.sk/", className = "sk.train.SayIntResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int sayInt(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws KarrerException1, KarrerException2, IOException_Exception;
}
