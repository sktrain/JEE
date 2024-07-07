package sk.train.client;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.*;
import sk.train.dao.EmpServiceImpl;
import sk.train.dao.EmpService;
import sk.train.model.Employee;
import sk.train.util.DelegatingEntityManager;
import sk.train.util.TransactionHandler;

public class Starter {

	public static void main(String[] args) {
		// Factory beschaffen
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Muster_JPA_Hibernate_H2_Local");

		//Zusammenbau
		EmpServiceImpl servimpl = new EmpServiceImpl();
		servimpl.setEntityManager(DelegatingEntityManager.getInstance());
		EmpService myserv = TransactionHandler.createProxy(emf, EmpService.class, servimpl);

		// ab jetzt: Nutzung des Proxy
		
		Employee emp = new Employee();
		emp.setEmployeeId(471);
		emp.setFirstName("Max");
		emp.setLastName("Mustermann");
		emp.setHireDate(Date.valueOf(LocalDate.of(2000, 1, 1)));
		emp.setJobId("IT_PROG");
		emp.setPhoneNumber("1111");
		emp.setSalary(new BigDecimal(5000l));
		emp.setEmail("Mustermann@murks.de" + 4711);

		myserv.createEmp(emp);

		Optional<Employee> optionalemp1 = myserv.readEmp(471);
		optionalemp1.ifPresent(employee -> System.out.println(employee.getLastName()));

		emp.setSalary(new BigDecimal(8000L));
		myserv.updateEmp(emp);

		optionalemp1 = myserv.readEmp(471);
		optionalemp1.ifPresent(employee -> System.out.println(employee.getSalary()));

		myserv.deleteEmp(471);

		List<Employee> le = myserv.getAllEmps();
		le.forEach(System.out::println);

		// usw.

	}

}
