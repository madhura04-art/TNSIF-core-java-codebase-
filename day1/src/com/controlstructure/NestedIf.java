package com.controlstructure;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20,c=20;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is grater");
			}
			else {
				System.out.println("c is greater ");
			}
		}
		else {
			if (c>b) {
				System.out.println("c is greater");
			}
			else {
				System.out.println("b is greater");
			}
		}

	}

}
