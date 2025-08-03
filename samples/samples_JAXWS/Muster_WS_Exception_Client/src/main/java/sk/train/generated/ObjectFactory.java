
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

    private static final QName _SayInt_QNAME = new QName("http://train.sk/", "sayInt");
    private static final QName _SayIntResponse_QNAME = new QName("http://train.sk/", "sayIntResponse");
    private static final QName _KarrerException1_QNAME = new QName("http://train.sk/", "KarrerException1");
    private static final QName _IOException_QNAME = new QName("http://train.sk/", "IOException");
    private static final QName _Fehler2_QNAME = new QName("http://train.sk/", "Fehler2");
    private static final QName _Fehler3_QNAME = new QName("samplenamespace", "Fehler3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.train.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayInt }
     * 
     * @return
     *     the new instance of {@link SayInt }
     */
    public SayInt createSayInt() {
        return new SayInt();
    }

    /**
     * Create an instance of {@link SayIntResponse }
     * 
     * @return
     *     the new instance of {@link SayIntResponse }
     */
    public SayIntResponse createSayIntResponse() {
        return new SayIntResponse();
    }

    /**
     * Create an instance of {@link KarrerException1 }
     * 
     * @return
     *     the new instance of {@link KarrerException1 }
     */
    public KarrerException1 createKarrerException1() {
        return new KarrerException1();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     * @return
     *     the new instance of {@link IOException }
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     * @return
     *     the new instance of {@link FaultBean }
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayInt")
    public JAXBElement<SayInt> createSayInt(SayInt value) {
        return new JAXBElement<>(_SayInt_QNAME, SayInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayIntResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayIntResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "sayIntResponse")
    public JAXBElement<SayIntResponse> createSayIntResponse(SayIntResponse value) {
        return new JAXBElement<>(_SayIntResponse_QNAME, SayIntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KarrerException1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KarrerException1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "KarrerException1")
    public JAXBElement<KarrerException1> createKarrerException1(KarrerException1 value) {
        return new JAXBElement<>(_KarrerException1_QNAME, KarrerException1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "Fehler2")
    public JAXBElement<String> createFehler2(String value) {
        return new JAXBElement<>(_Fehler2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     */
    @XmlElementDecl(namespace = "samplenamespace", name = "Fehler3")
    public JAXBElement<FaultBean> createFehler3(FaultBean value) {
        return new JAXBElement<>(_Fehler3_QNAME, FaultBean.class, null, value);
    }

}
