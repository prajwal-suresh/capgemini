package Capgemini.io.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Capgemini.io.hibernate.model.Student;
import Capgemini.io.hibernate.util.HibernateUtil;

public class App {
	public static void main(String []args) {
		Student student=new Student(1010,"Prajwal","S","praj@gmail.com");
		Transaction transaction=null;
		
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
			
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		
	}

}
