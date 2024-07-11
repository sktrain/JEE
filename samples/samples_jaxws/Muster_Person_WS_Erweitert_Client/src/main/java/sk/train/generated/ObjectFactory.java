
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

    private static final QName _GetPerson_QNAME = new QName("http://train.sk/", "getPerson");
    private static final QName _GetPersonList_QNAME = new QName("http://train.sk/", "getPersonList");
    private static final QName _GetPersonListResponse_QNAME = new QName("http://train.sk/", "getPersonListResponse");
    private static final QName _GetPersonResponse_QNAME = new QName("http://train.sk/", "getPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.train.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     * @return
     *     the new instance of {@link GetPerson }
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonList }
     * 
     * @return
     *     the new instance of {@link GetPersonList }
     */
    public GetPersonList createGetPersonList() {
        return new GetPersonList();
    }

    /**
     * Create an instance of {@link GetPersonListResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonListResponse }
     */
    public GetPersonListResponse createGetPersonListResponse() {
        return new GetPersonListResponse();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonResponse }
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     * @return
     *     the new instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonList }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "getPersonList")
    public JAXBElement<GetPersonList> createGetPersonList(GetPersonList value) {
        return new JAXBElement<>(_GetPersonList_QNAME, GetPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "getPersonListResponse")
    public JAXBElement<GetPersonListResponse> createGetPersonListResponse(GetPersonListResponse value) {
        return new JAXBElement<>(_GetPersonListResponse_QNAME, GetPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://train.sk/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

}
