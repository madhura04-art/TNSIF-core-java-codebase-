package com.tns.synchronization;

public class Accounttreads extends Thread {
	private Account acc;
	private int amt;
	//para constructor 
	public Accounttreads(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}
	
	@Override
	public void run()
	{
		try
		{
			acc.withdraw(amt);
		}
		catch(InsufficientBalance e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	
	
	
	

}
