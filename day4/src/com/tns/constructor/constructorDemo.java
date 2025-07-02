package com.tns.constructor;

import java.util.Scanner;

public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       
       int id ;
       System.out.println("Enter customer id");
       sc.nextInt();
       String name ;
       System.out.println("Enter customer Name\n");
       sc.next();
       String city ;
       System.out.println("Enter customer city\n");
       sc.next();
       
       Customer c1= new Customer();
       
       Customer c2= new Customer("Madhura",1,"Amravati" );
       
       System.out.println("Id:"+c1.getCustomerId());
       System.out.println("Name:"+c1.getCustomername());
       System.out.println("City:"+c1.getCustomerCity());
       
	}   

}
