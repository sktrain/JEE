
package org.javacream.order;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.javacream.order package. 
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

    private static final QName _Order_QNAME = new QName("http://javacream.org/order/", "Order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.javacream.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     * @return
     *     the new instance of {@link Order }
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     */
    @XmlElementDecl(namespace = "http://javacream.org/order/", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<>(_Order_QNAME, Order.class, null, value);
    }

}
