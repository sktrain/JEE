package sk.train.dao;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import sk.train.model.Department;
import sk.train.model.Employee;

public class EmpService {

	private EntityManager em;


	//default-Konstruktor
	public EmpService(EntityManager myem) {
		super();
		this.em = myem;
	}

	public void createEmp(Employee emp){
		em.persist(emp);
	}

	public Optional<Employee> readEmp(long id){
		return Optional.ofNullable(em.find(Employee.class, id));
	}

	public void deleteEmp(long id){
		Employee emp = em.find(Employee.class, id);
		if (emp != null)
			em.remove(emp);
	}

	public void updateEmp(Employee emp){
		if (em.find(Employee.class, emp.getEmployeeId()) != null){
			em.merge(emp);
		}
	}

	public List<Employee> getAllEmps(){
		//alle Angestellten: Named Query nutzen
		return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
	}

	/********** Ergaenzungen bzgl. Departments ***********/

	public List<Department> getAllDeps(){
		return em.createNamedQuery("Department.findAll", Department.class).getResultList();
	}

	public Optional<Department> readDep(long id){
		return Optional.ofNullable(em.find(Department.class, id));

	}

	public void createDep(Department dep){
		em.persist(dep);
	}

	public void deleteDep(long id){
		Department dep = em.find(Department.class, id);
		if (dep != null)
			em.remove(dep);
	}

	public void updateDep(Department  dep){
		if (em.find(Department.class, dep.getDepartmentId()) != null){
			em.merge(dep);
		}
	}

}
