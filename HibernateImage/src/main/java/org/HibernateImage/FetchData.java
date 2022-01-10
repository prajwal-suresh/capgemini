package org.HibernateImage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        //int address_Id=1;
        
        
        session.close();
        
        factory.close();
        

	}

}
