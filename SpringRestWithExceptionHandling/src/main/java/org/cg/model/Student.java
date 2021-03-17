package org.cg.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int sid;
	private String name;
	private int marks;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id", referencedColumnName="aid")
	private Address address;
	
	public Student() {
		
	}
	public Student(int sid, String name, int marks, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
