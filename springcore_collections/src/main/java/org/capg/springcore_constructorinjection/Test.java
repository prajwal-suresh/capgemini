package org.capg.springcore_constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("org/capg/springcore_constructorinjection/conf.xml");
		
		Person temp=(Person)context.getBean("person");
		System.out.println(temp);
		
		//Certi c=(Certi)context.getBean("cer");

	}

}
