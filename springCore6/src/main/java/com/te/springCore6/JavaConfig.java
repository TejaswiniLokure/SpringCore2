package com.te.springCore6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages ="com.te.springCore6" )
public class JavaConfig {
	@Bean
	public Address getAddress()
	{
		Address address=new Address();
		return address;
		
	}
	@Bean(name = {"emp","emp1"} )
	public Employee getEmployee()
	{
		Employee employee=new Employee(getAddress());
		return employee;
		
	}

}
