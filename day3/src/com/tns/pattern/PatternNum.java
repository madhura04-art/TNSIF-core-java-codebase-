package com.tns.pattern;

public class PatternNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		int num=1;
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=(4-i);j++)
			{
				
			}	
				for (int k=1;k<=i;k++)
				{
				System.out.print(num);
				num++;
				}
			System.out.println(" ");
		}

	}

}
