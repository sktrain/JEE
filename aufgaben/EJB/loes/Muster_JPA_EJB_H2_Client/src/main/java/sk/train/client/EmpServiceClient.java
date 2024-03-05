package sk.train.client;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Hashtable;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import sk.train.model.Department;
import sk.train.model.Employee;
import sk.train.service.EmpServiceRemote;

public class EmpServiceClient {

	public static void main(String[] args) throws NamingException, SQLException {
		// NamensContext beschaffen, setzt entsprechende Properties voraus
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		final Context context = new InitialContext(jndiProperties);
		// final Context context = new InitialContext();

		System.out.println("Bis hier ok");

		// Client-seitigen Proxy beschaffen

		EmpServiceRemote stub = (EmpServiceRemote) context
				.lookup("ejb:/Muster_JPA_EJB_H2/EmpService!sk.train.service.EmpServiceRemote");

		// Service aufrufen via Stub
		System.out.println(stub.readEmp(100L)); // King

		Employee emp = new Employee();
		emp.setEmployeeId(471L);
		emp.setFirstName("Max");
		emp.setLastName("Mustermann");
		emp.setHireDate(Date.valueOf(LocalDate.of(2000, 1, 1)));
		emp.setJobId("IT_PROG");
		emp.setPhoneNumber("1111");
		emp.setSalary(new BigDecimal(5000l));
		emp.setEmail("Mustermann@murks.de" + 4711);

		stub.createEmp(emp);

		System.out.println(stub.readEmp(471L).getLastName());

		emp.setSalary(new BigDecimal(8000L));
		stub.updateEmp(emp);

		System.out.println(stub.readEmp(471L).getSalary());

		stub.deleteEmp(471);

		// leider verwendet Hibernate unter der Haube interne Klassen bei den
		// Collections und da die
		// serialisierten Objekte solche Collectiontypen verwenden führt das ohne
		// Hibernate-Einbindung
		// auf der Client-Seite zur ClassNotFoundException
		stub.getAllEmps().forEach(System.out::println);

		System.out.println("\n ********************* jetzt zu den Departments *************\n");

		List<Department> deplist = stub.getAllDeps();
		deplist.forEach(System.out::println);

		Department dep = stub.readDep(50L);
		System.out.println("Hier kommt der Abteilungsleiter: " + (dep.getDepManager()));

		// jetzt mal alle Angestellten
		//das kann nicht mehr funktionieren, da ONE-To-Many lazy ist
		//System.out.println("\n ********************* alle Angestellten im Department *************\n");
		//dep.getEmployeesInDep().forEach(employee -> System.out.println(employee));

		Department newdep = new Department();
		Employee depmanager = stub.readDep(50L).getDepManager();
		newdep.setDepManager(depmanager);
		newdep.setDepartmentId(1L);
		newdep.setDepartmentName("KarrersDepartment");
		stub.createDep(newdep);

		System.out.println(stub.readDep(1L));

		stub.deleteDep(1L);

	}

}
