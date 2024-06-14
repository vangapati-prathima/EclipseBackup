package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	
	
	@Id
	int bid;
	String bname;

	
	public Bike() {
		super();
	}
	@Override
	public String toString() {
		return "Bike [bid=" + bid + ", bname=" + bname + "]";
	}
	public Bike(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

}
