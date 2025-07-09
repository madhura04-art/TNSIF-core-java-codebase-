package com.tns.singleDimensionalDemo;

public class ArrayOperation {
	static void  printArray(int arr[]) {
	    for (int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]);
	    	System.out.println();
	    }
	}
	public static int getSum(int n[]) {
		int sum=0;
		for (int no :n) 
			sum+=no;
		return sum;
	}
	public static int getoddcount(int b[]) {
		int count =0;
		for ( int i=0; i< b.length ;i++) {
			if(b[i]%2!=0) {
				count++;
			}
		}
		return count;
	}
	public static int getevencount(int b[]) {
		int count =0;
		for ( int i=0; i< b.length ;i++) {
			if(b[i]%2 == 0) {
				count++;
			}
		}
		return count;
	}

}
public class arrayDemo{
	public static void main(String args[]) {
		int n=10;
		int a[];
		a=new int[n];
		
		ArrayOperation.printArray(a);
		
		int b[]= {10,20,30,40};
		ArrayOperation.printArray(b);
		System.out.println("sum of array : "+ ArrayOperation.getSum(b));
		System.out.println("sum of array : "+ ArrayOperation.getSum(a));
		
		System.out.println("total odd number in array:"+ArrayOperation.getoddcount(b));
		System.out.println("total odd number in array:"+ArrayOperation.getoddcount(b));
		
		System.out.println("total even number in array:"+ArrayOperation.getevencount(b));
		System.out.println("total even number in array:"+ArrayOperation.getevencount(b));
		
		
	}
}


