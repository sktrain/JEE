package sk.train.dao;



import sk.train.model.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;



@Singleton
public class EmpService {
	
	//@PersistenceContext
	private EntityManager myem;

	
	public EmpService() {
		super();
		//this.myem = myem;
	}

	@PostConstruct
	public void init(){
		Employee emp = new Employee(99, "Otto" , "Muster", null, null, LocalDate.now()
				, "murkser", BigDecimal.valueOf(5000),BigDecimal.ZERO,BigDecimal.ONE, BigDecimal.ONE );
		this.createEmp(emp);
		emp = new Employee(98, "Hugo" , "Meier", null, null, LocalDate.of(2000,1,1)
				, "murkser", BigDecimal.valueOf(6000),BigDecimal.ZERO,BigDecimal.ONE, BigDecimal.ONE );
		this.createEmp(emp);
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
