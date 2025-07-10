package com.tns.multidimentionalDEmo;

public class Printarray {
	
	static void printarray(int c[][]) {
		System.out.println("element from array");
		for (int i=0; i<c.length;i++) {
			for (int j=0;j<=c[i].length;j++) {
				System.out.println(c[i][j] +" ");
			}
			System.out.println();
		}
}
public class multidimensionalDemo{
	public static void main(String args[]) {
		int c[][]={{2,3},{3,4},{4,5},{5,6}};
		Printarray.printarray(c);
	}
}
