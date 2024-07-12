package com.te.springCore1;

import java.util.Objects;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean,DisposableBean {
	private String city;
	private int pinCode;

	public Address() {
		super();
		System.out.println("constuctor of address class");
	}

	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, pinCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && pinCode == other.pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory method");
	}

}
