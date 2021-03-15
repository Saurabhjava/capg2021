package org.capg.bean;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	@JsonFormat(pattern="dd-MMM-yyyy")
	private LocalDate dob;
	
	public Employee() {
		
	}	
	public Employee(int empid, String name, double salary, LocalDate dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dob=dob;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	
}
