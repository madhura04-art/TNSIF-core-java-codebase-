package com.tns.interfacedemo;

public class savingAccount extends Customer implements Bank{
     
	private int Accno;
	private Float balance;
	
	
	public savingAccount(String city, String name,int accno, Float balance) {
		super(city, name);
		Accno = accno;
		this.balance = balance;
	}

	@Override
	public void Deposite(Float amount) {
		if (amount < 0  || amount >Deposite_Limit){
			System.out.println("please deposite a valid amount");
		}
		else {
			balance += amount;
			System.out.println("Rs"+ amount+ "is deposited");
		}
		
	}

	@Override
	public void withdraw(Float amount) {
		if (amount <= balance- MINBAL)	{
			balance -= amount;
			System.out.println("balance is "+balance);
		}
		else {
			System.out.println("insufficient  balance ");
		}
	}

	@Override
	public String toString() {
		return "savingAccount [Accno=" + Accno + ", balance=" + balance + ", getCity()=" + getCity() + ", getName()="
				+ getName() + "]";
	}
	
	
	

}
