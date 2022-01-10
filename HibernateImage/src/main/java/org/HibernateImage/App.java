package org.HibernateImage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

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
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Project started!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Address ad=new Address();
        ad.setStreet("street 1");
        ad.setCity("bangalore");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.3);
        Address ad1=new Address();
        ad1.setStreet("street 2");
        ad1.setCity("mumbai");
        ad1.setOpen(true);
        ad1.setAddedDate(new Date());
        ad1.setX(153.3);
        
        //reading an image
        FileInputStream fis=new FileInputStream("src/main/java/bangalore.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        
        Session session=factory.openSession();
        Transaction tran=session.beginTransaction();
        session.save(ad);
        session.save(ad1);
        tran.commit();
        
        //fetching data
        Address emp=(Address)session.get(Address.class,1);
        System.out.println(emp.getCity());
        
        session.close();
        System.out.println("Record updated,Done....");
    }
}
