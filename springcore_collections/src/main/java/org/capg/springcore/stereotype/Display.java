package org.capg.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("org/capg/springcore/stereotype.congfxml.xml");
		Student student=context.getBean("student",Student.class);
		
		System.out.println(student);

	}

}
