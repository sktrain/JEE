package sk.train;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String... args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Muster_JPA_Hibernate_H2_Local");
        EntityManager em = emf.createEntityManager();
        
        System.out.println(" Hello EntityManager: " + em);
        
    }
}
