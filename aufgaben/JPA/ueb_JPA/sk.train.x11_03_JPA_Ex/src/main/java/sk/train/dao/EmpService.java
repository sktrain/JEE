package sk.train.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import sk.train.model.Department;
import sk.train.model.Employee;


public class EmpService {
	
	//@PersistenceContext
	private EntityManager myem;

	
	//default-Konstruktor
	public EmpService(EntityManager myem) {
		super();
		this.myem = myem;
	}
	
	/********** Employee-Zugriffe ***********/

	public void createEmp(Employee emp){
		myem.persist(emp);
	}

	public Optional<Employee> readEmp(long id){
		return Optional.ofNullable(myem.find(Employee.class, id));
	}

	public void removeEmp(long id){
		Employee emp = myem.find(Employee.class, id);
		if (emp != null)
			myem.remove(emp);
	}

	public void setSalaryEmp(long id, BigDecimal sal){
		Employee emp = myem.find(Employee.class, id);
		if (emp != null)
			emp.setSalary(sal);
	}

	public List<Employee> getEmps(){
		//alle Angestellten: Named Query nutzen
		return myem.createNamedQuery("Employee.findAll", Employee.class).getResultList();
	}

	/********** Ergaenzungen bzgl. Departments ***********/

	public List<Department> getDeps(){
		return myem.createNamedQuery("Department.findAll", Department.class).getResultList();
	}

	public Optional<Department> readDep(long id){
		return Optional.ofNullable(myem.find(Department.class, id));

	}

	public void createDep(Department dep){
		myem.persist(dep);
	}

	public void removeDep(long id){
		Department dep = myem.find(Department.class, id);
		if (dep != null)
			myem.remove(dep);
	}

	public void updateDep(Department  dep){
		if (myem.find(Department.class, dep.getDepartmentId()) != null){
			myem.merge(dep);
		}
	}



	/********** Query-Beispiele ***********/
	
	public List<Employee> getempsBySalary(BigDecimal lowerbound){
		//alle Ang. mit Gehalt >= lowerbound
		return null;
	}
	
	public BigDecimal getSumSalary() {
		//Summe der Gehälter
		return null;
	}
	
	public List  //<Name> 
		getNames(){
		//Liste aller Nachnamen + Vorname mit Mapping auf passende Klasse
		
		return null;		
	}
	
	public List<Object[]> getNamesAsParts(){
		//Liste aller Nachnamen + Vorname
		
		return null;		
	}
	
	//als JPQL-Query
	public List<Employee> getChefs(){
		// Liste aller Chefs, d.h. alle die irgendjemands Chef sind
		// select * from employees where 
		//  employee_id in (select distinct manager_id from employees)
		return null;
	}
	
	//als JPQL-Query
	public List<Employee>  getIndianer(){
		//alle, die keine Chefs sind
		return null;
	}
	
	//Liste der Chefs (Nativer Query), Vorsicht Schema muss qualifiziert werden
	public List<Employee> getChefsNative(){
		return null;		
	}
	
	//Liste der Indianer (Nativer Query)
	public List<Employee> getIndianerNative(){
	   return null;
		}
	
}
