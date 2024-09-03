package sk.train.client;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPConstants;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.soap.SOAPPart;
import jakarta.xml.ws.Dispatch;
import jakarta.xml.ws.Service;


public class Client {

	public static void main(String[] args) throws InterruptedException, SOAPException, IOException {

		URL url = new URL("http://localhost:8080/Hello_WS_Provider/HelloProvider?wsdl");
		
		QName qname = new QName("http://train.sk/", "HelloProviderService");
		
		Service service = Service.create(url, qname);		
//		
//		HelloWorld hw = service.getPort(HelloWorld.class);
//		
//		String answer = hw.sayHello("Otto");
//		System.out.println(answer);
		
		
		//Dispatch-Client
		
		Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName("http://train.sk/","HelloProviderPort"), SOAPMessage.class, Service.Mode.MESSAGE);
		
//		QName portName = new QName("http://com/ibm/was/wssample/echo/",
//		 "EchoServicePort");
//				
//		/** Create a service and add at least one port to it. **/ 
//		Service service = Service.create(serviceName);
//		service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, endpointUrl);
//				
//		/** Create a Dispatch instance from a service.**/ 
//		Dispatch<SOAPMessage> dispatch = service.createDispatch(portName, 
//		SOAPMessage.class, Service.Mode.MESSAGE);
			
		/** Create SOAPMessage request. **/
		// compose a request message
		MessageFactory mf = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);

		// Create a message.  This example works with the SOAPPART.
		SOAPMessage request = mf.createMessage();
		SOAPPart part = request.getSOAPPart();

		// Obtain the SOAPEnvelope and header and body elements.
		SOAPEnvelope env = part.getEnvelope();
		//SOAPHeader header = env.getHeader();
		SOAPBody body = env.getBody();

		// Construct the message payload.
		SOAPElement operation = body.addBodyElement(new QName("http://train.sk/", "invoke"));
		SOAPElement value = operation.addChildElement(new QName("arg0"));
		value.addTextNode("ping");
		request.saveChanges();
		
		request.writeTo(System.out);
		System.out.println();

		/** Invoke the service endpoint. **/
		SOAPMessage response = dispatch.invoke(request);

		/** Process the response. **/
		response.writeTo(System.out);
		System.out.println(); //flush
		
		
	}

}

