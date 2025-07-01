package com.tnsif.day1;

public class TypeCasting {
	public static void main(String args[]) {
		//widening 
		byte b1 = 10;
		int i = b1;
		System.out.println(i);
		
		float f = 22.14f;
		double d= f;
		System.out.println(d);
		
		//Narrowing // explicit type casting 
		
		double f1=10.52f;
		long l1 = (long)f1;
		System.out.println(l1);
		
		long l2 =8668525992L;
		int num= (int)l2;
		System.out.println("number in int :"+num);
		
		short a=130;
		byte b4 = (byte)a;
		System.out.println(a);
				
		
		
		
	}

}
