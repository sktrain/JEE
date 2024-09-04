package sk.train.dao;



import sk.train.model.Employee;

import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.List;



@Stateless
public class EmpService {
	
	private EntityManager myem;

	
	public EmpService() {
		super();
		//this.myem = myem;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		System.err.println(em.getClass().getName());
		myem = em;
	}
	
	public void createEmp(Employee emp){
		//System.err.println(emp);
		myem.persist(emp);
	}
	
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public Employee readEmp(long id){
		Employee emp = myem.find(Employee.class, id);
		return emp;
	}
	
	public void removeEmp(long id){
		Employee emp = myem.find(Employee.class, id);
		if (emp != null)
		myem.remove(emp);
	}
	
	public Employee saveEmp(Employee emp){
		Employee managedemp = myem.merge(emp);
		return managedemp;
	}

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public List<Employee> getemps(){
		//alle Angestellten: Named Query nutzen
		return myem.createNamedQuery("Employee.findAll", Employee.class).getResultList();
	}
	
	
}
