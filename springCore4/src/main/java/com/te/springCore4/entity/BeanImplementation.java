package com.te.springCore4.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore4.Student;

public class BeanImplementation {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/te/springCore4/config.xml");
		Student student1 = (Student) context.getBean("student");
		Student student2 = (Student) context.getBean("student");
		Student student3 = (Student) context.getBean("student");
//		System.out.println(student1.setAddress(""));
		System.out.println(student1);
		System.out.println(student2);
		student3.setStuName("shjgda");
		System.out.println(student3);

	}

}
