package sk.train.rest;

import java.util.List;

import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import sk.train.model.Department;
import sk.train.mv.dao.DepartmentService;

@Path("/departmentserv")
public class RestEndpoint {
	
	@EJB
	private DepartmentService ds;
	
	//URL .../departmentserv?id=...
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDep(@QueryParam("id") long id) {
		Department d = ds.getDepartment(id);
		return d.toString();
	}
	
	
	//URL .../departmentserv/json?id=...
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getDepasJSON(@QueryParam("id") long id) {
		Department d = ds.getDepartment(id);
		return d;
	}
	
	//URL .../departmentserv/xml?id=...
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Department getDepasXML(@QueryParam("id") long id) {
		Department d = ds.getDepartment(id);
		return d;
	}
	
	//URL .../departmentserv/create?id=...&name=...
	@GET
	@Path("/create")
	//@Produces(MediaType.APPLICATION_JSON)
	public void createDep(@QueryParam("id") long id,
								@QueryParam("name") String name) {
		ds.createDepartment(id, name);
//		Department d = ds.getDepartment(id);
//		return d;
	}
	
	//URL .../departmentserv/getall
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getall() {
		return ds.getallDepartments();
	}
	
	
	

}
