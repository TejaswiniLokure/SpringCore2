package com.te.springCore6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImplementationcClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee employee = (Employee) context.getBean("emp1");
		  
		

	}

}
