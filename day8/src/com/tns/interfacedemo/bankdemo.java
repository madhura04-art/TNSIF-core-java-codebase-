package com.tns.interfacedemo;

public class bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		savingAccount s1= new savingAccount("Amravati", "Madhura", 23, 20000f);
		s1.Deposite(700f);
		System.out.println(s1);
		s1.withdraw(200f);
		System.out.println(s1);
		
	}

}
