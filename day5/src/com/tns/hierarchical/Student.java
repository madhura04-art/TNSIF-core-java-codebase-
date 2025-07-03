package com.tns.hierarchical;

public class Student extends Person{
	private String class1;
	private String Percent;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String class2, String percent,String name, String city) {
		super( name, city);
		class1 = class2;
		Percent = percent;
	}
	@Override
	public String toString() {
		return "Student [class1=" + class1 + ", Percent=" + Percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public String getPercent() {
		return Percent;
	}
	public void setPercent(String percent) {
		Percent = percent;
	}
	
	

}
