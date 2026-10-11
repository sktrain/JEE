package sk.train.client;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

import sk.train.dao.EmpService;
import sk.train.model.Department;
import sk.train.model.Employee;
import sk.train.util.TransactionTemplate;

public class Starter {

	public static void main(String[] args) {
		// Factory beschaffen
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Muster_JPA_Hibernate_H2_Local");
		
		EmpService myserv = new EmpService();

		TransactionTemplate template = new TransactionTemplate(emf, myserv, true);		

		Employee emp = new Employee();
		emp.setEmployeeId(471);
		emp.setFirstName("Max");
		emp.setLastName("Mustermann");
		emp.setHireDate(Date.valueOf(LocalDate.of(2000, 1, 1)));
		emp.setJobId("IT_PROG");
		emp.setPhoneNumber("1111");
		emp.setSalary(new BigDecimal(5000l));
		emp.setEmail("Mustermann@murks.de" + 4711);

		template.run(manager -> {
			myserv.createEmp(emp);
		});

		Optional<Employee> optionalemp1 = template.runWithResult(manager -> {
			return myserv.readEmp(471);
		});
		optionalemp1.ifPresent(employee -> System.out.println(employee.getLastName()));

		template.run(manager -> {
			emp.setSalary(new BigDecimal(8000L));
			myserv.updateEmp(emp);
		});
		
		optionalemp1 = template.runWithResult(manager -> {
			return myserv.readEmp(471);
		});
		optionalemp1.ifPresent(employee -> System.out.println(employee.getSalary()));
		
		

		template.run(manager -> {
			myserv.deleteEmp(471);
		});
	
		
		List<Employee> le = template.runWithResult(manager -> {
			return myserv.getAllEmps();
		});
		le.forEach(System.out::println);
		
		//usw.


	}

}
