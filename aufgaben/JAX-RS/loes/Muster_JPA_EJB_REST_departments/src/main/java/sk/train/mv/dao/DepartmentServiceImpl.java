package sk.train.mv.dao;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sk.train.model.Department;

/**
 * Session Bean implementation class DepartmentServiceImpl
 */
@Stateless
public class DepartmentServiceImpl implements DepartmentService {
	
	@PersistenceContext(name="Ueb3_JPA_DefaultDS_EJB")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public DepartmentServiceImpl() {
        
    }
    
    @Override
	public Department getDepartment(long department_id) {
    	Department d = em.find(Department.class, department_id);
    	if (d == null) {
    		throw new IllegalArgumentException("ungültige ID verwendet");
    	}
    	return d;
    }
    
    @Override
	public void createDepartment(long department_id, String department_name) {
    	Department d = new Department();
    	d.setDepartmentId(department_id);
    	d.setDepartmentName(department_name);
    	em.persist(d);
    }
    
    @Override
	public void removeDepartment(long department_id) {
    	Department d = em.find(Department.class, department_id);
    	if (d == null) {
    		throw new IllegalArgumentException("ungültige ID verwendet");
    	}
    	em.remove(d);
    }
    
    @Override
	public List<Department> getallDepartments(){
    	return em.createNamedQuery("Department.findAll", Department.class).getResultList();
    }
    

}
