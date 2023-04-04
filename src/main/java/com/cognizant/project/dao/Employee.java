package com.cognizant.project.dao;

public class Employee {
	
	private String Firstname;
	private String Lastname;
	private String DOB;
	private String sex;
	private String country;
	private String city;
	private int pincode;
	public String getFirstname() {
		return Firstname;
	}
	public Employee(String firstname, String lastname, String dOB, String sex, String country, String city,
			int pincode) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		DOB = dOB;
		this.sex = sex;
		this.country = country;
		this.city = city;
		this.pincode = pincode;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
