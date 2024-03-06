package sk.train.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import sk.train.model.Department;
import sk.train.model.Employee;

public class EmpServiceImpl implements EmpService {

	private EntityManager em;


	//default-Konstruktor
	public EmpServiceImpl() {
		super();
	}
	

	//setter für den delegierenden EntityManager, der den jeweiligen an den Thread-gebundenen EntityManager liefert
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	

	@Override
	public void createEmp(Employee emp){
		em.persist(emp);
	}

	@Override
	public Optional<Employee> readEmp(long id){
		return Optional.ofNullable(em.find(Employee.class, id));
	}

	@Override
	public void deleteEmp(long id){
		Employee emp = em.find(Employee.class, id);
		if (emp != null)
			em.remove(emp);
	}

	@Override
	public void updateEmp(Employee emp){
		if (em.find(Employee.class, emp.getEmployeeId()) != null){
			em.merge(emp);
		}
	}

	@Override
	public List<Employee> getAllEmps(){
		//alle Angestellten: Named Query nutzen
		return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
	}

	/********** Ergaenzungen bzgl. Departments ***********/

	@Override
	public List<Department> getAllDeps(){
		return em.createNamedQuery("Department.findAll", Department.class).getResultList();
	}

	@Override
	public Optional<Department> readDep(long id){
		return Optional.ofNullable(em.find(Department.class, id));

	}

	@Override
	public void createDep(Department dep){
		em.persist(dep);
	}

	@Override
	public void deleteDep(long id){
		Department dep = em.find(Department.class, id);
		if (dep != null)
			em.remove(dep);
	}

	@Override
	public void updateDep(Department  dep){
		if (em.find(Department.class, dep.getDepartmentId()) != null){
			em.merge(dep);
		}
	}

}
