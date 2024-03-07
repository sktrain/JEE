package sk.train.beans;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import sk.train.model.Employee;
import sk.train.service.EmpServiceLocal;

@Named
@RequestScoped
public class EmployeeBean {

	@Inject // alternativ @EJB
	private EmpServiceLocal empserv;

	private Employee emp = new Employee(); 

	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee getEmp() {
		return emp;
	}
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

	public String createEmp() {
		//restliche Attribute setzen
		emp.setHireDate(Date.valueOf(LocalDate.of(1980, 1, 1)));
		emp.setJobId("IT_PROG");
		emp.setPhoneNumber("1111");
		emp.setSalary(new BigDecimal(5000l));
		emp.setEmail("Mustermann@murks.de");
		// Rest null
		empserv.createEmp(emp);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Employee erzeugt", "Employee " + emp.getLastName() + " wurde erzeugt mit id=" + emp.getEmployeeId()));
		return "newEmp.xhtml";  //Navigation!
	}

	public void findEmpById() {
		emp = empserv.readEmp(emp.getEmployeeId());
	}
	
	public List<Employee> getAllEmployees(){
		return empserv.getAllEmps();
	}
	
	
	
	

}
