package com.te.springCore6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{5645+6345}")
	private int x;
	@Value("#{46*64}")
	private int y;
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
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + "]";
	}
	
	

}
