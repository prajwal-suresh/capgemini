package org.capg.springcore_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("org/capg/springcore_reference/refconf.xml");
		
		A temp=(A)context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println(temp);
		
		B tem=(B)context.getBean("bref");
		System.out.println(tem);
		((AbstractApplicationContext)context).close();

	}

}
