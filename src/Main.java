
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTACION
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJavaAPPPU");
        EntityManager em= emf.createEntityManager(null);
        //C
        em.getTransaction().begin();
        Persona p = new Persona();
        p.setNombre("NN");
        p.setTelefono(12345);
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
             
       
        
    }
    
}
