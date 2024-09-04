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
		Employee emp = repo.readEmp(id);
		if (emp == null) {
			throw new EmployeeNotFoundException("No Employee for id: " + id);
		}
		return emp;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> allEmps() {
		return repo.getemps();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	public Employee createEmp(Employee emp) {
		if (repo.readEmp(emp.getEmployeeId()) != null) {
			throw new EmployeeExistsException("Employee exists for id: " + emp.getEmployeeId());
		}
		return repo.saveEmp(emp);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Employee updateEmp(@PathParam("id") Long  id, Employee emp) {
		if (repo.readEmp(id) != null) {
			return repo.saveEmp(emp);
		} else {
			throw new EmployeeNotFoundException("No Employee for id: "+ id);
		}
	}

	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteEmp(@PathParam("id") Long id) {
		if (repo.readEmp(id) != null) {
			repo.removeEmp(id);  //wirft nur IllegalArgumentException falls ID null
		} else {
			throw new EmployeeNotFoundException("No Employee for id: "+ id);
		}
	}

}
