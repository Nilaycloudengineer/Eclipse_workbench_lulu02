package com.lulu.morespringbeans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class AutowiringdemoApplication {
	public static void main(String[] args) {
//SpringApplication.run(AutowiringdemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lulu/morespringbeans/beans.xml");
		Employee emp = context.getBean("employee", Employee.class);

		
		//We injecting values not by XML 
		emp.setEid(101);
		emp.setEname("Spring Framework By Nilay");
		
		emp.showEployeeDetails();
	}
}
