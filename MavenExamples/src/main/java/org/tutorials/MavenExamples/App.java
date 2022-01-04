package org.tutorials.MavenExamples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Project started!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cnf.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Order p=new Order();
        p.setId(1);
        p.setName("food");
        p.setDesc("grilled food");

		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();
		
		session.save(p);
		tx.commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }
}
