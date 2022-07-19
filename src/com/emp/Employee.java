 package com.emp;

public class Employee {
	private String empName;
	private double empSalary;
	private String companyName;
	private String empId;
	
	public Employee(String empName, double empSalary, String companyName, String empId) {
		
		this.empName = empName;
		this.empSalary = empSalary;
		this.companyName = companyName;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", companyName=" + companyName + ", empId="
				+ empId + "]";
	}
	
	
	

}
