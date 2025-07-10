package com.tns.jaggedArray;

class jaggedsrray{
	static void printarray(int c[][]) {
		System.out.println("element from array");
		for (int i=0; i<c.length;i++) {
			for (int j=0;j<=c[i].length;j++) {
				System.out.println(c[i][j] +" ");
			}
			System.out.println();
		}
	}

public class jaggedArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]= {{12,34,60},{10,20,30},{1,2},{78,87,56,89}};
		  System.out.println("length"+ c.length);
		  jaggedsrray.printarray(c);
			
		}

	}

}
