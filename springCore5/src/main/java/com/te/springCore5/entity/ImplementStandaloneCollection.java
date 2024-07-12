package com.te.springCore5.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore5.Employee;

public class ImplementStandaloneCollection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/springCore5/config.xml");

		Employee employee =context.getBean("employee",Employee.class);
		System.out.println(employee);
		System.out.println(employee.hashCode());
		Employee employee1 =context.getBean("employee",Employee.class);
		System.out.println(employee);
		System.out.println(employee1.hashCode());
		
		
	}

}
