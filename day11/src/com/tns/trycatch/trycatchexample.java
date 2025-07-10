package com.tns.trycatch;

public class trycatchexample {
	
		static void  performdiv(int a,int b) {
			 System.out.println("i am in method ");
			   try {
				   System.out.println("i am in side try block");
			    int  res= a/b;
			     System.out.println("result: "+res);
			     }
			   catch(ArithmeticException e)
			   {
			   }
		}
		
	
}
