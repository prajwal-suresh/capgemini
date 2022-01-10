package org.capg.springcore_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =
        		 new ClassPathXmlApplicationContext("config.xml");
        Order order=(Order)context.getBean("order");
        System.out.println(order);
        Order orderone=(Order)context.getBean("orderone");
        System.out.println(orderone);
        
        //object for class emp
        Emp emp=(Emp)context.getBean("emp");
        System.out.println(emp);
    }
}
