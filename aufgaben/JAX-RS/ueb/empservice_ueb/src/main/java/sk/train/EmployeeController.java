package sk.train;

import sk.train.dao.EmpService;
import sk.train.model.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class EmployeeController {

	@PostConstruct
	public void init(){
		Employee emp = new Employee(99, "Otto" , "Muster", null, null, LocalDate.now()
				, "murkser", BigDecimal.valueOf(5000),BigDecimal.ZERO,BigDecimal.ONE, BigDecimal.ONE );
		repo.createEmp(emp);
		emp = new Employee(98, "Hugo" , "Meier", null, null, LocalDate.of(2000,1,1)
				, "murkser", BigDecimal.valueOf(6000),BigDecimal.ZERO,BigDecimal.ONE, BigDecimal.ONE );
		repo.createEmp(emp);
	}

	@EJB
	EmpService repo;

	//todo

}
