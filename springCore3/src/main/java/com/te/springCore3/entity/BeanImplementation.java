package com.te.springCore3.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore3.Student;

public class BeanImplementation {
	public static void main(String[] args) {
		
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/te/springCore3/config.xml");
	   Student student=  (Student) context.getBean("student");
	 System.out.println(student);

	
	}

}
