package com.te.springCore7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELImplementation {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/springCore7/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
