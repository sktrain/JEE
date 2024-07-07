package sk.train.dao;

import sk.train.model.Department;
import sk.train.model.Employee;

import java.util.List;

public interface EmpServiceIf {
    void createEmp(Employee emp);

    Employee readEmp(long id);

    void deleteEmp(long id);

    void updateEmp(Employee emp);

    List<Employee> getAllEmps();

    List<Department> getAllDeps();

    Department readDep(long id);

    void createDep(Department dep);

    void deleteDep(long id);

    void updateDep(Department dep);
}
