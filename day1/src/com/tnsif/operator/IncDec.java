package com.tnsif.operator;

public class IncDec {
	public static void main (String args[]) {
		/*
		 * pre ++var name : increment and assignment 
		 */
		int a=-1;
		int b=1;
		int c=0;
		
		//          (-1)+(2)-(-1)-3+3-0+(-1)+(-2)+(-2)+(-2)-(5)+(-2)+5
		 int res =(--c)+(++b)-(b++)-(a)+(--a)+(--c)+(++c)+(--c)-(++b)+(c)+(b--);
		 System.out.println(res);
	}

}
