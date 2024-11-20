package sk.train;

import java.util.HashMap;
import org.javacream.order.Order;

import jakarta.jws.WebService;
import ws.javacream.org.samples.order.SimpleOrderWebService;

@WebService(endpointInterface = "ws.javacream.org.samples.order.SimpleOrderWebService")
public class SimpleOrderWebServiceImpl implements SimpleOrderWebService {
	
	private HashMap<String, Order> ao = new HashMap<>();

	@Override
	public Order createOrder(String customerId, String category, String item, int amount) {
		Order order = new Order();
		order.setCustomerId(customerId);
		order.setAccepted(true);
		order.setDate(null);
		order.setOrderId(item);
		order.setTotalPrice(amount);
		ao.put(item, order);
		return order;
	}

	@Override
	public Order findOrderById(String orderId) {
		return ao.get(orderId);
	}

}
