package com.tns.String;

public class stringbufferDemo {
	public static void main(String args[]) {
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer);
		System.out.println("length : "+buffer.length());
		System.out.println("capacity : "+buffer.capacity());
		
		String s;
		int a=42;
		buffer = new StringBuffer();
		s=buffer.append("a=").append(a).toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuffer("i java ");
		buffer.insert(2,"like ");
		System.out.println(buffer);
		buffer.delete(2,6);
		System.out.println(buffer);
		
	}

}
