package com.tns.interfacedemo;

public interface Bank {
	
	final static Float MINBAL= 5000f;
	final static Float Deposite_Limit= 2000f;
	public void Deposite(Float amount);
	public void withdraw(Float amount);
	
	
		
	}


