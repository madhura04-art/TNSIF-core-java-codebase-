package com.tns.inheritence;

public class Citizen {
  private String name;
  private String Aadhar;
  private String Address;
  private Long phone;
  
  public Citizen() {
	  System.out.println("Citizen object Created");
  }
  public Citizen(String name, String aadhar, String address, Long phone) {

	super();
	this.name = name;
	Aadhar = aadhar;
	Address = address;
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAadhar() {
	return Aadhar;
}
public void setAadhar(String aadhar) {
	Aadhar = aadhar;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
  
}
