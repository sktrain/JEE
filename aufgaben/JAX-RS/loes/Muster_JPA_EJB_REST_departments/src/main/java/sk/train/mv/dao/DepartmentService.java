package sk.train.mv.dao;

import java.util.List;

import jakarta.ejb.Local;
import sk.train.model.Department;

@Local
public interface DepartmentService {

	Department getDepartment(long department_id);

	void createDepartment(long department_id, String department_name);

	void removeDepartment(long department_id);

	List<Department> getallDepartments();

}