package com.te.springCore6;

import org.springframework.stereotype.Component;

public class Employee {
	private Address address;
	
	public Employee() {
		super();
		System.out.println("constructor of employee class");
	}
	

	public Employee(Address address) {
		super();
		this.address = address;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void empl()
	{
		this.address.display();
		System.out.println("method of employee");
	}
	
}
