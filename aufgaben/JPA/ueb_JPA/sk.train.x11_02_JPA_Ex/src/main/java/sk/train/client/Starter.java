package sk.train.client;

import sk.train.dao.EmpService;
import sk.train.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Starter {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("Muster_JPA_Hibernate_H2_Local");
		 EntityManager em = emf.createEntityManager();
		 
		 EmpService myserv = new EmpService(em);
		 
		 Employee emp = new Employee();
			emp.setEmployeeId(471);
			emp.setFirstName("Max");
			emp.setLastName("Mustermann");
			emp.setHireDate(Date.valueOf(LocalDate.of(2000, 1, 1)));
			emp.setJobId("IT_PROG");
			emp.setPhoneNumber("1111");
			emp.setSalary(new BigDecimal(5000l));
			emp.setEmail("Mustermann@murks.de" + 4711);
		 
		// mal Funktionalitaet von EmpService austesten insbesondere auch zu den Abteilungen
		 
		// z.B. mal alle Abteilungen holen und ausgeben
		 
		 
		 //z.B. Abteilungsleiter zu Abteilung 50
		 
		 
		 //z. b. alle Angestellten aus Abteilung 50
		 
		 

	}

}
