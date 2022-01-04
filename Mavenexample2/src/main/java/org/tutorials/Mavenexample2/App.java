package org.tutorials.Mavenexample2;

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
        Product p=new Product();
		p.setId(1);
		p.setName("Iphone 13");
		p.setDesc("mobile phone");
		p.setPrice(7000);
		

		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();
		
		session.save(p);
		tx.commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }
}
