package org.tutorials.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cnf.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Employee em=new Employee();
		em.setId(103);
		em.setName("Praj");
		em.setCity("Bangalore");

		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		session.save(em);
		session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }
}
