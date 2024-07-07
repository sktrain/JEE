package sk.train.service;

import java.util.List;
import jakarta.ejb.Remote;

import sk.train.model.Department;
import sk.train.model.Employee;

@Remote
public interface EmpServiceRemote {
	
	void createEmp(Employee emp);

	Employee readEmp(long id);
	
	void updateEmp(Employee emp);

	void deleteEmp(long id);

	List<Employee> getAllEmps();	

	void createDep(Department dep);
	
	Department readDep(long id);	

	void deleteDep(long id);

	void updateDep(Department dep);
	
	List<Department> getAllDeps();


}