package com.tns.association.hasa;

public class Person {
 private String name;
 private Address address;
 
 
 public Person(String name, Address adress) {
	super();
	this.name = name;
	this.address = adress;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAdress() {
	return address;
}
public void setAdress(Address adress) {
	this.address = adress;
}

// method to display
 public void display() {
	 System.out.println("Name:"+name);
	 System.out.println("address:"+address.getStreet()+","+address.getCity()+","+address.getState()+address.getPostalcode());
 }
 
 
}
