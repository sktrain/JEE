
package sk.train.model;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk.train.model package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _CreateDep_QNAME = new QName("http://ws.train.sk/", "createDep");
    private final static QName _CreateDepResponse_QNAME = new QName("http://ws.train.sk/", "createDepResponse");
    private final static QName _CreateEmp_QNAME = new QName("http://ws.train.sk/", "createEmp");
    private final static QName _CreateEmpResponse_QNAME = new QName("http://ws.train.sk/", "createEmpResponse");
    private final static QName _DeleteDep_QNAME = new QName("http://ws.train.sk/", "deleteDep");
    private final static QName _DeleteDepResponse_QNAME = new QName("http://ws.train.sk/", "deleteDepResponse");
    private final static QName _DeleteEmp_QNAME = new QName("http://ws.train.sk/", "deleteEmp");
    private final static QName _DeleteEmpResponse_QNAME = new QName("http://ws.train.sk/", "deleteEmpResponse");
    private final static QName _GetAllDeps_QNAME = new QName("http://ws.train.sk/", "getAllDeps");
    private final static QName _GetAllDepsResponse_QNAME = new QName("http://ws.train.sk/", "getAllDepsResponse");
    private final static QName _GetAllEmps_QNAME = new QName("http://ws.train.sk/", "getAllEmps");
    private final static QName _GetAllEmpsResponse_QNAME = new QName("http://ws.train.sk/", "getAllEmpsResponse");
    private final static QName _ReadDep_QNAME = new QName("http://ws.train.sk/", "readDep");
    private final static QName _ReadDepResponse_QNAME = new QName("http://ws.train.sk/", "readDepResponse");
    private final static QName _ReadEmp_QNAME = new QName("http://ws.train.sk/", "readEmp");
    private final static QName _ReadEmpResponse_QNAME = new QName("http://ws.train.sk/", "readEmpResponse");
    private final static QName _UpdateDep_QNAME = new QName("http://ws.train.sk/", "updateDep");
    private final static QName _UpdateDepResponse_QNAME = new QName("http://ws.train.sk/", "updateDepResponse");
    private final static QName _UpdateEmp_QNAME = new QName("http://ws.train.sk/", "updateEmp");
    private final static QName _UpdateEmpResponse_QNAME = new QName("http://ws.train.sk/", "updateEmpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.train.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateDep }
     * 
     */
    public CreateDep createCreateDep() {
        return new CreateDep();
    }

    /**
     * Create an instance of {@link CreateDepResponse }
     * 
     */
    public CreateDepResponse createCreateDepResponse() {
        return new CreateDepResponse();
    }

    /**
     * Create an instance of {@link CreateEmp }
     * 
     */
    public CreateEmp createCreateEmp() {
        return new CreateEmp();
    }

    /**
     * Create an instance of {@link CreateEmpResponse }
     * 
     */
    public CreateEmpResponse createCreateEmpResponse() {
        return new CreateEmpResponse();
    }

    /**
     * Create an instance of {@link DeleteDep }
     * 
     */
    public DeleteDep createDeleteDep() {
        return new DeleteDep();
    }

    /**
     * Create an instance of {@link DeleteDepResponse }
     * 
     */
    public DeleteDepResponse createDeleteDepResponse() {
        return new DeleteDepResponse();
    }

    /**
     * Create an instance of {@link DeleteEmp }
     * 
     */
    public DeleteEmp createDeleteEmp() {
        return new DeleteEmp();
    }

    /**
     * Create an instance of {@link DeleteEmpResponse }
     * 
     */
    public DeleteEmpResponse createDeleteEmpResponse() {
        return new DeleteEmpResponse();
    }

    /**
     * Create an instance of {@link GetAllDeps }
     * 
     */
    public GetAllDeps createGetAllDeps() {
        return new GetAllDeps();
    }

    /**
     * Create an instance of {@link GetAllDepsResponse }
     * 
     */
    public GetAllDepsResponse createGetAllDepsResponse() {
        return new GetAllDepsResponse();
    }

    /**
     * Create an instance of {@link GetAllEmps }
     * 
     */
    public GetAllEmps createGetAllEmps() {
        return new GetAllEmps();
    }

    /**
     * Create an instance of {@link GetAllEmpsResponse }
     * 
     */
    public GetAllEmpsResponse createGetAllEmpsResponse() {
        return new GetAllEmpsResponse();
    }

    /**
     * Create an instance of {@link ReadDep }
     * 
     */
    public ReadDep createReadDep() {
        return new ReadDep();
    }

    /**
     * Create an instance of {@link ReadDepResponse }
     * 
     */
    public ReadDepResponse createReadDepResponse() {
        return new ReadDepResponse();
    }

    /**
     * Create an instance of {@link ReadEmp }
     * 
     */
    public ReadEmp createReadEmp() {
        return new ReadEmp();
    }

    /**
     * Create an instance of {@link ReadEmpResponse }
     * 
     */
    public ReadEmpResponse createReadEmpResponse() {
        return new ReadEmpResponse();
    }

    /**
     * Create an instance of {@link UpdateDep }
     * 
     */
    public UpdateDep createUpdateDep() {
        return new UpdateDep();
    }

    /**
     * Create an instance of {@link UpdateDepResponse }
     * 
     */
    public UpdateDepResponse createUpdateDepResponse() {
        return new UpdateDepResponse();
    }

    /**
     * Create an instance of {@link UpdateEmp }
     * 
     */
    public UpdateEmp createUpdateEmp() {
        return new UpdateEmp();
    }

    /**
     * Create an instance of {@link UpdateEmpResponse }
     * 
     */
    public UpdateEmpResponse createUpdateEmpResponse() {
        return new UpdateEmpResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDep }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "createDep")
    public JAXBElement<CreateDep> createCreateDep(CreateDep value) {
        return new JAXBElement<CreateDep>(_CreateDep_QNAME, CreateDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDepResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDepResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "createDepResponse")
    public JAXBElement<CreateDepResponse> createCreateDepResponse(CreateDepResponse value) {
        return new JAXBElement<CreateDepResponse>(_CreateDepResponse_QNAME, CreateDepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateEmp }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "createEmp")
    public JAXBElement<CreateEmp> createCreateEmp(CreateEmp value) {
        return new JAXBElement<CreateEmp>(_CreateEmp_QNAME, CreateEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateEmpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "createEmpResponse")
    public JAXBElement<CreateEmpResponse> createCreateEmpResponse(CreateEmpResponse value) {
        return new JAXBElement<CreateEmpResponse>(_CreateEmpResponse_QNAME, CreateEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDep }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "deleteDep")
    public JAXBElement<DeleteDep> createDeleteDep(DeleteDep value) {
        return new JAXBElement<DeleteDep>(_DeleteDep_QNAME, DeleteDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDepResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDepResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "deleteDepResponse")
    public JAXBElement<DeleteDepResponse> createDeleteDepResponse(DeleteDepResponse value) {
        return new JAXBElement<DeleteDepResponse>(_DeleteDepResponse_QNAME, DeleteDepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteEmp }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "deleteEmp")
    public JAXBElement<DeleteEmp> createDeleteEmp(DeleteEmp value) {
        return new JAXBElement<DeleteEmp>(_DeleteEmp_QNAME, DeleteEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteEmpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "deleteEmpResponse")
    public JAXBElement<DeleteEmpResponse> createDeleteEmpResponse(DeleteEmpResponse value) {
        return new JAXBElement<DeleteEmpResponse>(_DeleteEmpResponse_QNAME, DeleteEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDeps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDeps }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "getAllDeps")
    public JAXBElement<GetAllDeps> createGetAllDeps(GetAllDeps value) {
        return new JAXBElement<GetAllDeps>(_GetAllDeps_QNAME, GetAllDeps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "getAllDepsResponse")
    public JAXBElement<GetAllDepsResponse> createGetAllDepsResponse(GetAllDepsResponse value) {
        return new JAXBElement<GetAllDepsResponse>(_GetAllDepsResponse_QNAME, GetAllDepsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmps }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEmps }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "getAllEmps")
    public JAXBElement<GetAllEmps> createGetAllEmps(GetAllEmps value) {
        return new JAXBElement<GetAllEmps>(_GetAllEmps_QNAME, GetAllEmps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmpsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEmpsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "getAllEmpsResponse")
    public JAXBElement<GetAllEmpsResponse> createGetAllEmpsResponse(GetAllEmpsResponse value) {
        return new JAXBElement<GetAllEmpsResponse>(_GetAllEmpsResponse_QNAME, GetAllEmpsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDep }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "readDep")
    public JAXBElement<ReadDep> createReadDep(ReadDep value) {
        return new JAXBElement<ReadDep>(_ReadDep_QNAME, ReadDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDepResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDepResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "readDepResponse")
    public JAXBElement<ReadDepResponse> createReadDepResponse(ReadDepResponse value) {
        return new JAXBElement<ReadDepResponse>(_ReadDepResponse_QNAME, ReadDepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEmp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadEmp }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "readEmp")
    public JAXBElement<ReadEmp> createReadEmp(ReadEmp value) {
        return new JAXBElement<ReadEmp>(_ReadEmp_QNAME, ReadEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEmpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadEmpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "readEmpResponse")
    public JAXBElement<ReadEmpResponse> createReadEmpResponse(ReadEmpResponse value) {
        return new JAXBElement<ReadEmpResponse>(_ReadEmpResponse_QNAME, ReadEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDep }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "updateDep")
    public JAXBElement<UpdateDep> createUpdateDep(UpdateDep value) {
        return new JAXBElement<UpdateDep>(_UpdateDep_QNAME, UpdateDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDepResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDepResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "updateDepResponse")
    public JAXBElement<UpdateDepResponse> createUpdateDepResponse(UpdateDepResponse value) {
        return new JAXBElement<UpdateDepResponse>(_UpdateDepResponse_QNAME, UpdateDepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateEmp }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "updateEmp")
    public JAXBElement<UpdateEmp> createUpdateEmp(UpdateEmp value) {
        return new JAXBElement<UpdateEmp>(_UpdateEmp_QNAME, UpdateEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateEmpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.train.sk/", name = "updateEmpResponse")
    public JAXBElement<UpdateEmpResponse> createUpdateEmpResponse(UpdateEmpResponse value) {
        return new JAXBElement<UpdateEmpResponse>(_UpdateEmpResponse_QNAME, UpdateEmpResponse.class, null, value);
    }

}
