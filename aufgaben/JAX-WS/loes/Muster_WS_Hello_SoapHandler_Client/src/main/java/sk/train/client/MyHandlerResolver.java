package sk.train.client;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;

public class MyHandlerResolver implements  HandlerResolver{

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {

		List<Handler> handlerChain = new ArrayList<Handler>();
		handlerChain.add(new MySoapHandler());
		return handlerChain;
	}

}
