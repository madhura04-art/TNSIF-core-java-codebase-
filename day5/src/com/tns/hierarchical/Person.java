package com.tns.hierarchical;

public class Person {
	private String name;
	private String City;
	public Person() {
		super();
	}
	
	public Person(String name, String city) {
		
		this.name = name;
		City = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", City=" + City + "]";
	}
	

}
