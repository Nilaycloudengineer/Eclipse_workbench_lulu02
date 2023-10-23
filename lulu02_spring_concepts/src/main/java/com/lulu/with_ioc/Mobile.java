package com.lulu.with_ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
	
		
		System.out.println("Hello Nilay");
//		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lulu/with_ioc/beans.xml");
//		
//		// Get the bean  Magic of Spring container
		Sim sim = applicationContext.getBean("nilay", Sim.class);  // no new key to create objects
//		
//		// Calling the methods
		sim.calling();
		sim.data();
	}
}
