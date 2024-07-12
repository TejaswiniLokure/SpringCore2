package com.te.springCore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springCore2.entity.Employee;

public class AutowireImplementation {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/te/springCore2/autowiringconfig.xml");
		 Employee employee=(Employee) context.getBean("employee");
		 System.out.println(employee);
	}

}
