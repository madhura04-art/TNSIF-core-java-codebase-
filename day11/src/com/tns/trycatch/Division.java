package com.tns.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
 public static void divide(int i, int j) {
	 int a,b,c;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter values for a,b:");
			 try {
				 
				 a=sc.nextInt();
				 b=sc.nextInt();
				 c=a/b;
				 System.out.println("result:"+c);
			 }
	     catch(InputMismatchException e){
	    	 System.err.println(e.getMessage());	 
	     }
	     catch(ArithmeticException e){
	    	 System.err.println(e.getMessage());	 
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	    	 System.err.println(e.getMessage());	 
	     }
		 catch(Exception e){
		    	 System.err.println(e.getMessage());	 
		 }
	     finally {
				 System.out.println("thanks for visiting ");
	     }
 }
 
}
