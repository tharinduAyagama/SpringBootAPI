package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
	
	public Laptop() {
		super();
		System.out.println("lap constructor");
	}
	private int lID;
	private String brandName;
	
	public int getlID() {
		return lID;
	}
	public void setlID(int lID) {
		this.lID = lID;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public void sayHeloo() {
		System.out.println("hello from lap");
	}
	
	
}
