package com.tns.finallyblock;

import java.util.Scanner;

public class usingThrow {
  
	 static int acceptnumber() {
		 Scanner sc = new Scanner(System.in); 
		 int n= sc.nextInt();
		 sc.close();
		 return n;
	 }
	 public static void main (String args[]) {
		 int per ;
		 System.out.println("enter percentage:");;
		
		   per=acceptnumber();
		 try {
			 if (per<0) {
				 throw new negativeException();
			 }	 
			 else if(per>100) {
				 throw new greatervalueException();
				 
			 }
			 else {
				 System.out.println("percentage"+per);
			 }
		 }
			catch (Exception e) {
				System.out.println("error....."+e.getMessage());
			}
	        
				 
			 
		 }
	 }