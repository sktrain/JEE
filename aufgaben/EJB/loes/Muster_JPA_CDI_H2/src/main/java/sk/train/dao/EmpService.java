package sk.train.dao;

import sk.train.model.Department;
import sk.train.model.Employee;

import jakarta.enterprise.context.Dependent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

//@Default
@Dependent
@Transactional
public class EmpService implements EmpServiceIf {

	@PersistenceContext(unitName ="Muster_JPA_Hibernate_H2_Wildfly")
	private EntityManager em;


	//default-Konstruktor
	public EmpService() {
		super();
	}

	@Override
	public void createEmp(Employee emp){
		em.persist(emp);
	}

	@Override
	@Transactional(Transactional.TxType.SUPPORTS)
	public Employee readEmp(long id){
		return em.find(Employee.class, id);
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
	@Transactional(Transactional.TxType.SUPPORTS)
	public List<Employee> getAllEmps(){
		//alle Angestellten: Named Query nutzen
		return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
	}

	/********** Ergaenzungen bzgl. Departments ***********/

	@Override
	@Transactional(Transactional.TxType.SUPPORTS)
	public List<Department> getAllDeps(){
		return em.createNamedQuery("Department.findAll", Department.class).getResultList();
	}

	@Override
	@Transactional(Transactional.TxType.SUPPORTS)
	public Department readDep(long id){
		return em.find(Department.class, id);

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
	public void updateDep(Department dep){
		if (em.find(Department.class, dep.getDepartmentId()) != null){
			em.merge(dep);
		}
	}

}
