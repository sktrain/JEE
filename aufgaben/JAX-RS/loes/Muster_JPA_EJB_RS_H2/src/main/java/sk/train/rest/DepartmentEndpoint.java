package sk.train.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import sk.train.dao.EmpService;
import sk.train.model.Department;


@Path("/department")
public class DepartmentEndpoint {
	
	@EJB
	private EmpService ds;
	
	//URL .../department/text?id=...
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDep(@QueryParam("id") long id) {
		Department d = ds.readDep(id);
		return d.toString();
	}
	
	
	//URL .../department/json?id=...
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getDepasJSON(@QueryParam("id") long id) {
		Department d = ds.readDep(id);
		return d;
	}
	
	//URL .../department/xml?id=...
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Department getDepasXML(@QueryParam("id") long id) {
		Department d = ds.readDep(id);
		return d;
	}
	
	//URL .../department/create?id=...&name=...
	@GET
	@Path("/create")
	//@Produces(MediaType.APPLICATION_JSON)
	public void createDep(Department dep) {
		ds.createDep(dep);
	}
	
	//URL .../department
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getall() {
		return ds.getAllDeps();
	}
	
	
	

}
