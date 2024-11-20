package sk.train.client;

import java.util.Set;

import javax.xml.namespace.QName;

import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPHeaderElement;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class MySoapHandler implements SOAPHandler<SOAPMessageContext> {


	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outbound) {
			try {
				SOAPMessage soapMessage = context.getMessage();
				SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
				// Ensure there is a header and add element.
				if (envelope.getHeader() == null)
					envelope.addHeader();
				SOAPHeader header = envelope.getHeader();
				QName qn = new QName("KarrersNamespace", "mystring");
				SOAPHeaderElement e = header.addHeaderElement(qn);
				// Now insert into the header.
				String s = "HalloHeader";
				e.addAttribute(new QName("token"), "Karrer");
				soapMessage.saveChanges();
			} catch (Exception e) {
				throw new RuntimeException("SOAPException thrown.", e);
			}
		}
		return true; 
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
