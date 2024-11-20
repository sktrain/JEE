package sk.train.handler;

import java.util.HashSet;
import java.util.Set;
import javax.xml.namespace.QName;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPHeaderElement;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class TokenHandler implements SOAPHandler<SOAPMessageContext> {
	@Override
	public Set<QName> getHeaders() {
		return new HashSet<QName>();
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		logContext(context);
		return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		try {
			SOAPMessage soapMessage = context.getMessage();
			SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
			// Ensure there is a header
			SOAPHeader header = envelope.getHeader();
			if (header != null) {
				NodeList elements = header.getElementsByTagNameNS("KarrersNamespace", "mystring");
				if (elements.getLength() > 0)	{
					Node element = elements.item(0);
					Node attribute = element.getAttributes().getNamedItem("token");
					System.out.println("Empfangenes Token: " + attribute.getNodeValue());
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("SOAPException thrown.", e);
		}

		return true;
	}

	private void logContext(SOAPMessageContext context) {
		try {
			SOAPMessage message = context.getMessage();
			message.writeTo(System.out);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}