package sk.train;

import sk.train.dao.EmpService;
import sk.train.model.Employee;

import jakarta.ejb.EJB;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/employee")
public class EmployeeController {



	@EJB
	EmpService repo;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Employee empById(@PathParam("id") Long id) {
		return repo.readEmp(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> allEmps() {
		return repo.getemps();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	public void createEmp(Employee emp) {
		repo.createEmp(emp);   //was ist, wenn die id schon existiert (update, statt create?)
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Employee updateEmp(@PathParam("id") Long  id, Employee emp) {
		if (repo.readEmp(id) != null) {
			return repo.saveEmp(emp);
		} else {
			return emp;			//war kein Update !!, sollten wir Fehler produzieren?
		}
	}

	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteEmp(@PathParam("id") Long id) {
		repo.removeEmp(id);
	}

}
