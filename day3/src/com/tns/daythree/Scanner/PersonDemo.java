package com.tns.daythree.Scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args, int Tax) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       String name;
       System.out.println("enter name of the user :");
       name= sc.next();
       
       String gender;
       System.out.println("enter gender of the user :");
       gender= sc.next() ;
       
       int age;
       System.out.println("enter age of the user :");
       age= sc.nextInt() ;
       
       
       long mobileNumber;
       System.out.println("enter mobile number of the user :");
       mobileNumber= sc.nextLong() ;
       
       int income;
       System.out.println("enter income of the user :");
       income= sc.nextInt() ;
       
       Person person = new Person();
       
       person.setName(name);
       person.setGender(gender);
       person.setAge(age);
       person.setIncome(income);
       person.setMobileNumber(mobileNumber);
       
       
       
       System.out.println(person.getName());
       System.out.println(person.getGender());
       System.out.println(person.getAge());
       System.out.println(person.getIncome());
       System.out.println(person.getTax());
       TaxCalculation calc= new TaxCalculation();
       calc.calculateTax(person);
       
       //System.out.println(person.getName());
       
       
       
       
       
       
       
       
              
	}

}
