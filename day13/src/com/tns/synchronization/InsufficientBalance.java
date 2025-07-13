package com.tns.synchronization;

public class InsufficientBalance extends Exception {
	public InsufficientBalance()
	{
		super("Insufficient balance in your account");
	}
	
	public InsufficientBalance(String message)
	{
		super(message);
	}
	

}
