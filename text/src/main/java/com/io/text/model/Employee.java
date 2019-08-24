package com.io.text.model;

public class Employee {
	public int empId;
	public String name;
	public String email;
	public long mobileNumber;
	
	public Employee(int empId, String name, String email, long mobileNumber) {
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", getEmpId()=" + getEmpId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getMobileNumber()=" + getMobileNumber() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
