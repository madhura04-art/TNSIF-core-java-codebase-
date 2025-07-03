package com.tns.association.hasa;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address = new Address("104 tapodham colony","talegaon","maharashtra","410507");
		
		Person pr = new Person("madhura",address);
		pr.display();
		System.out.println(pr);
		
		
		
	}

}
