package sk.train.client;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

import sk.train.dao.EmpService;
import sk.train.model.Department;
import sk.train.model.Employee;

public class Starter {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Muster_JPA_Hibernate_H2_Local");
        EntityManager em = emf.createEntityManager();


        EmpService myserv = new EmpService(em);

        Employee emp = new Employee();
        emp.setEmployeeId(471);
        emp.setFirstName("Max");
        emp.setLastName("Mustermann");
        emp.setHireDate(Date.valueOf(LocalDate.of(2000, 1, 1)));
        emp.setJobId("IT_PROG");
        emp.setPhoneNumber("1111");
        emp.setSalary(new BigDecimal(5000l));
        emp.setEmail("Mustermann@murks.de" + 4711);

        EntityTransaction t = em.getTransaction();
        t.begin();
        myserv.createEmp(emp);
        t.commit();

        t = em.getTransaction();
        t.begin();
        Optional<Employee> optionalemp1 = myserv.readEmp(471);
        optionalemp1.ifPresent(employee -> System.out.println(employee.getLastName()));
        t.commit();

        t = em.getTransaction();
        t.begin();
        emp.setSalary(new BigDecimal(8000L));
        myserv.updateEmp(emp);
        t.commit();

        t = em.getTransaction();
        t.begin();
        optionalemp1 = myserv.readEmp(471);
        optionalemp1.ifPresent(employee -> System.out.println(employee.getSalary()));
        t.commit();

        t = em.getTransaction();
        t.begin();
        myserv.deleteEmp(471);
        t.commit();
        
        System.out.println(myserv.readEmp(100L));

        myserv.getAllEmps().forEach(System.out::println);

        System.out.println("\n ********************* jetzt zu den Departments *************\n");

        List<Department> deplist = myserv.getAllDeps();
        deplist.forEach(System.out::println);

        Optional<Department> odep = myserv.readDep(50L);
        odep.ifPresent(department ->
                System.out.println("Hier kommt der Abteilungsleiter: " + (department.getDepManager())));

        //jetzt mal alle Angestellten
        System.out.println("\n ********************* alle Angestellten im Department *************\n");
        Department dep = null;
        if (odep.isPresent()) {
            dep = odep.get();
            dep.getEmployeesInDep().forEach(employee -> System.out.println(employee));
        }

        t = em.getTransaction();
        t.begin();
        Department newdep = new Department();
        Employee depmanager = myserv.readDep(50L).get().getDepManager();
        newdep.setDepManager(depmanager);
        newdep.setDepartmentId(1L);
        newdep.setDepartmentName("KarrersDepartment");
        myserv.createDep(newdep);
        t.commit();

        System.out.println(myserv.readDep(1L).get());

        t = em.getTransaction();
        t.begin();
        Department newdep1 = new Department();
        newdep.setDepartmentId(1L);
        newdep.setDepartmentName("KarrersDepartment2");
        myserv.updateDep(newdep1);
        t.commit();


        System.out.println(myserv.readDep(1L).get());

        t = em.getTransaction();
        t.begin();
        myserv.deleteDep(1L);
        t.commit();

    }

}
