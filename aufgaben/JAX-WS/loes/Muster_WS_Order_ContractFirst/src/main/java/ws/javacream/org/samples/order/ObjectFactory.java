
package ws.javacream.org.samples.order;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.javacream.org.samples.order package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CreateOrder_QNAME = new QName("http://org.javacream.ws/samples/order", "createOrder");
    private static final QName _CreateOrderResponse_QNAME = new QName("http://org.javacream.ws/samples/order", "createOrderResponse");
    private static final QName _FindOrderById_QNAME = new QName("http://org.javacream.ws/samples/order", "findOrderById");
    private static final QName _FindOrderByIdResponse_QNAME = new QName("http://org.javacream.ws/samples/order", "findOrderByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.javacream.org.samples.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     * @return
     *     the new instance of {@link CreateOrder }
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     * @return
     *     the new instance of {@link CreateOrderResponse }
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link FindOrderById }
     * 
     * @return
     *     the new instance of {@link FindOrderById }
     */
    public FindOrderById createFindOrderById() {
        return new FindOrderById();
    }

    /**
     * Create an instance of {@link FindOrderByIdResponse }
     * 
     * @return
     *     the new instance of {@link FindOrderByIdResponse }
     */
    public FindOrderByIdResponse createFindOrderByIdResponse() {
        return new FindOrderByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://org.javacream.ws/samples/order", name = "createOrder")
    public JAXBElement<CreateOrder> createCreateOrder(CreateOrder value) {
        return new JAXBElement<>(_CreateOrder_QNAME, CreateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://org.javacream.ws/samples/order", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindOrderById }{@code >}
     */
    @XmlElementDecl(namespace = "http://org.javacream.ws/samples/order", name = "findOrderById")
    public JAXBElement<FindOrderById> createFindOrderById(FindOrderById value) {
        return new JAXBElement<>(_FindOrderById_QNAME, FindOrderById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindOrderByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://org.javacream.ws/samples/order", name = "findOrderByIdResponse")
    public JAXBElement<FindOrderByIdResponse> createFindOrderByIdResponse(FindOrderByIdResponse value) {
        return new JAXBElement<>(_FindOrderByIdResponse_QNAME, FindOrderByIdResponse.class, null, value);
    }

}
