package com.bloodbank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.annotation.Id;

@Entity
@Table(name="blood_storage")
public class BloodStorageBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String blood_type;
	private String amount;
	private String city;
	
	public BloodStorageBean() {}
	
	public BloodStorageBean( String blood_type, String amount, String city) {
		super();
		//this.bid = bid;
		this.blood_type = blood_type;
		this.amount = amount;
		this.city = city;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBlood_type() {
		return blood_type;
	}
	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
