package org.capg.springcore_lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("org/capg/springcore_lifecycle/confi.xml");
		context.registerShutdownHook();

		/*Samosa s=(Samosa)context.getBean("samosa");
		System.out.println(s);
		System.out.println("********");
		Pepsi p=(Pepsi)context.getBean("pepsi");
		System.out.println(p);
		context.close();*/
		Example ex=(Example) context.getBean("example");
		System.out.println(ex);
	}

}
