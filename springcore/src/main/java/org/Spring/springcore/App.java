package org.Spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //object created for spring application
        //connect with java class
        
        Student student = (Student)context.getBean("student");
        Student student1 = (Student)context.getBean("stud");
        
        System.out.println(student);
        System.out.println(student1);
    }
}
