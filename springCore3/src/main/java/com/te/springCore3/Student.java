package com.te.springCore3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int stuId;
	private String stuName;
	@Autowired
    @Qualifier("address1")
	private Address address;

	public Student() {
		super();
		System.out.println("constructor of student class");
	}

	public Student(Address address) {
		System.out.println("constructor of implemeting autowiring annotation");
	}

	public Student(int stuId, String stuName, Address address) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.address = address;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setting address");
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", address=" + address + "]";
	}

}
