package com.te.springCore1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subjects;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Example [subjects=" + subjects + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("method starting");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("method end");
	}

}
