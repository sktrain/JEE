
package sk.train.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk.train.generated package. 
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

    private static final QName _SayDate_QNAME = new QName("http://train.sk/", "sayDate");
    private static final QName _SayDateResponse_QNAME = new QName("http://train.sk/", "sayDateResponse");
    private static final QName _SayDateasString_QNAME = new QName("http://train.sk/", "sayDateasString");
    private static final QName _SayDateasStringResponse_QNAME = new QName("http://train.sk/", "sayDateasStringResponse");
    private static final QName _SayHello_QNAME = new QName("http://train.sk/", "sayHello");
    private static final QName _SayHelloResponse_QNAME = new QName("http://train.sk/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.train.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayDate }
     * 
     * @return
     *     the new instance of {@link SayDate }
     */
    public SayDate createSayDate() {
        return new SayDate();
    }

    /**
     * Create an instance of {@link SayDateResponse }
     * 
     * @return
     *     the new instance of {@link SayDateResponse }
     */
    public SayDateResponse createSayDateResponse() {
        return new SayDateResponse();
    }

    /**
     * Create an instance of {@link SayDateasString }
     * 
     * @return
     *     the new instance of {@link SayDateasString }
     */
    public SayDateasString createSayDateasString() {
        return new SayDateasString();
    }

    /**
     * Create an instance of {@link SayDateasStringResponse }
     * 
     * @return
     *     the new instance of {@link SayDateasStringResponse }
     */
    public SayDateasStringResponse createSayDateasStringResponse() {
        return new SayDateasStringResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     * @return
     *     the new instance of {@link SayHello }
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     * @return
     *     the new instance of {@link SayHelloResponse }
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     * @return
     *     the new instance of {@link LocalDateTime }
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayDate")
    public JAXBElement<SayDate> createSayDate(SayDate value) {
        return new JAXBElement<>(_SayDate_QNAME, SayDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayDateResponse")
    public JAXBElement<SayDateResponse> createSayDateResponse(SayDateResponse value) {
        return new JAXBElement<>(_SayDateResponse_QNAME, SayDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayDateasString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayDateasString }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayDateasString")
    public JAXBElement<SayDateasString> createSayDateasString(SayDateasString value) {
        return new JAXBElement<>(_SayDateasString_QNAME, SayDateasString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayDateasStringResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayDateasStringResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayDateasStringResponse")
    public JAXBElement<SayDateasStringResponse> createSayDateasStringResponse(SayDateasStringResponse value) {
        return new JAXBElement<>(_SayDateasStringResponse_QNAME, SayDateasStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
