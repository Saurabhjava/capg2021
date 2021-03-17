package org.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int aid;
	private String city;
	private String country;
	
	public Address() {
		
	}
	public Address(int aid, String city, String country) {
		super();
		this.aid = aid;
		this.city = city;
		this.country = country;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
}
