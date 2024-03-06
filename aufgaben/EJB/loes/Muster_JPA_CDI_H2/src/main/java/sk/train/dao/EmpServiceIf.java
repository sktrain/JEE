package sk.train.dao;

import sk.train.model.Department;
import sk.train.model.Employee;

import javax.transaction.Transactional;
import java.util.List;

public interface EmpServiceIf {
    void createEmp(Employee emp);

    @Transactional(Transactional.TxType.SUPPORTS)
    Employee readEmp(long id);

    void deleteEmp(long id);

    void updateEmp(Employee emp);

    @Transactional(Transactional.TxType.SUPPORTS)
    List<Employee> getAllEmps();

    @Transactional(Transactional.TxType.SUPPORTS)
    List<Department> getAllDeps();

    @Transactional(Transactional.TxType.SUPPORTS)
    Department readDep(long id);

    void createDep(Department dep);

    void deleteDep(long id);

    void updateDep(Department dep);
}
