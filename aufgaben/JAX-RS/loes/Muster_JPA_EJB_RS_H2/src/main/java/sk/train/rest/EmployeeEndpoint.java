package sk.train.rest;

import sk.train.dao.EmpService;
import sk.train.model.Employee;

import jakarta.ejb.EJB;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/employee")
public class EmployeeEndpoint {



	@EJB
	EmpService repo;

	//URL .../employee/id
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Employee empById(@PathParam("id") Long id) {
		return repo.readEmp(id);
	}

	//URL .../employee
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> allEmps() {
		return repo.getAllEmps();
	}

	//URL .../employee
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createEmp(Employee emp) {
		repo.createEmp(emp);   //was ist, wenn die id schon existiert (update, statt create?)
	}

	//URL .../employee
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateEmp(Employee emp) {
		if (repo.readEmp(emp.getEmployeeId()) != null) {
			repo.updateEmp(emp);
		} else {
			;			//war kein Update !!, sollten wir Fehler produzieren?
		}
	}

	//URL .../employee/id
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteEmp(@PathParam("id") Long id) {
		repo.deleteEmp(id);
	}

}
