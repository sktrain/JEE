package sk.train.rest;

import java.util.List;

import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

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
