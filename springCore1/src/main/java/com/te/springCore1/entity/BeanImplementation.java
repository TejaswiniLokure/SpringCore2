package com.te.springCore1.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore1.Example;
import com.te.springCore1.Student;

public class BeanImplementation {
	public static void main(String[] args) {

//		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/springCore1/config.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/te/springCore1/config.xml");

	 Student student=(Student) context.getBean("address2");
	 System.out.println(student);
//	 
//	 System.out.println(student.getStuId());
//	 System.out.println(student.getStuName());
//	
//	 System.out.println(student.getCourses());
//	 System.out.println(student.getAddress().getCity());
//	 System.out.println(student.getAddress().getPinCode());
		context.registerShutdownHook();
 
//	Address address= (Address) context.getBean("address1");
//	System.out.println(address);
//		Example example = (Example) context.getBean("example");
//		System.out.println(example);

	}

}
