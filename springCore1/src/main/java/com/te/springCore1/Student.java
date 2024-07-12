package com.te.springCore1;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("7364")
	private int stuId;
	@Value("dfgdhg")
	private String stuName;
	private List<String> courses;
	private Address address;

	public Student() {
		super();
		System.out.println("constructor of student class");
	}

	public Student(int stuId, String stuName, List<String> courses, Address address) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.courses = courses;
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

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		System.out.println("setting course");
		this.courses = courses;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, courses, stuId, stuName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(courses, other.courses) && stuId == other.stuId
				&& Objects.equals(stuName, other.stuName);
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", courses=" + courses + ", address=" + address
				+ "]";
	}

	public void init() {
		System.out.println("init()");
	}

	public void destroy() {
		System.out.println("destroy()");

	}

}
