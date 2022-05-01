package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")										// 4)
public class Student {
	
	

	public Student() {
		super();
		System.out.println("Objected created(constructor invoked!)");
	}

	private int rollNo;											// 2)
	private String name;										// 2)
	private String tech;										// 2)
	
	@Autowired
	private Laptop laptop;										// 5)
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("Inside Student");					// 2)	
		laptop.compile();   									// 5)
	}
}
