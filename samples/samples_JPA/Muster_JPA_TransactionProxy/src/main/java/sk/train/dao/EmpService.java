package sk.train.dao;

import java.util.List;
import java.util.Optional;

import sk.train.model.Department;
import sk.train.model.Employee;

public interface EmpService {

	void createEmp(Employee emp);

	Optional<Employee> readEmp(long id);

	void deleteEmp(long id);

	void updateEmp(Employee emp);

	List<Employee> getAllEmps();

	/********** Ergaenzungen bzgl. Departments ***********/

	List<Department> getAllDeps();

	Optional<Department> readDep(long id);

	void createDep(Department dep);

	void deleteDep(long id);

	void updateDep(Department dep);

}