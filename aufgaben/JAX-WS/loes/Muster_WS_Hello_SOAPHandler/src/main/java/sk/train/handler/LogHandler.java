package sk.train.handler;

import java.util.HashSet;
import java.util.Set;
import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class LogHandler implements SOAPHandler<SOAPMessageContext> {
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
		logContext(context);
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