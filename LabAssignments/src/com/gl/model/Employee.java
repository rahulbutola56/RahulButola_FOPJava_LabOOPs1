package com.gl.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String company;
	
	public Employee(String firstName, String lastName, String company){
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCompanyName() {
		return company;
	}
	
	public void setCompanyName(String companyName) {
		this.company = companyName;
	}
}
