package com.te.springCore4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value = "prototype")
public class Student {
	@Value("2134")
	private int stuId;
	@Value("tejaswini")
	private String stuName;
	@Autowired
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
