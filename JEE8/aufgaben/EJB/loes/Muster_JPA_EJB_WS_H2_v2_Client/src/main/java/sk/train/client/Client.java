package sk.train.client;

import sk.train.model.EmpServiceIf;
import sk.train.model.EmpWebServiceService;
import sk.train.model.Employee;


public class Client {

	public static void main(String[] args) {

		EmpWebServiceService serv = new EmpWebServiceService();
		
		EmpServiceIf stub = serv.getEmpWebServicePort();
		
		Employee e = stub.readEmp(100L);
		System.out.println(e.getLastName());
		
		System.out.println("\n********************************************************\n");

		stub.getAllEmps().forEach(emp -> System.out.println(emp.getLastName()));
		
		System.out.println("\n********************************************************\n");
		
		System.out.println(stub.readDep(50L));
		
		System.out.println("\n********************************************************\n");
		
		stub.getAllDeps().forEach(dep -> System.out.println(dep.getDepartmentName()));

	}

}
