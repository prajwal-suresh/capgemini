package org.capg.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		 ApplicationContext context= new ClassPathXmlApplicationContext("org/capg/springcore/standalonecollection/config.xml");
	        
	        Person person=context.getBean("person",Person.class);
	        System.out.println(person);
	        ((AbstractApplicationContext) context).close();
	}

}
