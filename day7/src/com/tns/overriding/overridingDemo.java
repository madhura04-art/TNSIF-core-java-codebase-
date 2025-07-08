package com.tns.overriding;

public class overridingDemo {

	public static void main(String[] args) {
		SBI rbi ;
		rbi= new SBI();
		System.out.println(rbi.getRateOfinterest());
		ICICI rbi1 ;
		rbi1= new ICICI();
		System.out.println(rbi1.getRateOfinterest());
		HDFC rbi11 ;
		rbi11= new HDFC();
		System.out.println(rbi11.getRateOfinterest());
		
		
	}

}
