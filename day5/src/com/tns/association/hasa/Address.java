package com.tns.association.hasa;

public class Address {
	private String street;
	
	private String city ;
	private String State;
	private String Postalcode;
	
	 public Address()
	 {
		 super();
	 }

	public Address(String street, String city, String state, String postalcode) {
		super();
		this.street = street;
		this.city = city;
		State = state;
		Postalcode = postalcode;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPostalcode() {
		return Postalcode;
	}

	public void setPostalcode(String postalcode) {
		Postalcode = postalcode;
	}
    
	

}
