package com.te.springCore7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{5645+6345}")
	private int x;
	@Value("#{46*64}")
	private int y;
	// satatic method
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	// static variable
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{new java.lang.String('tejaswini')}")
	private String name;
	@Value("#{8>6}")
	public boolean isActive;

	public Student() {
		super();
		System.out.println("default constructor of student class");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
