package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alean {
	private int aID;
	private String name;
	@Autowired
	@Qualifier("lap")
	private Laptop lap;
	
	
	public Alean() {
		super();
		System.out.println("Alian constrctor");
	}
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
	public void hello() {
		System.out.println("Hello");
		lap.sayHeloo();
	}
	
}
