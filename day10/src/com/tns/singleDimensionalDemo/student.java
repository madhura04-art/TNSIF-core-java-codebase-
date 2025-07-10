package com.tns.singleDimensionalDemo;

public class student {
	private String  name;
	private int rollno;
	public student(int rollno, String name) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
    
}
