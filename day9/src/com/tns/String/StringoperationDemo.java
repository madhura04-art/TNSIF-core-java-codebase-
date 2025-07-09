package com.tns.String;

public class StringoperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =new String(" Indian ");
		System.out.println(s1);
		String s2= s1.toUpperCase();
		System.out.println(s2);
		int a=s2.length();
		System.out.println("length of String: "+a);
		
		String s3= s1.substring(1,5);
		System.out.println("subString : "+s3);
		
		System.out.println(s1.trim());
	//	System.out.println(s1.stripTailings());
		System.out.println(s1.isEmpty());
		
		//comparison
		s2=new String ();
		
		System.out.println("case 1:"+s1.equals(s2));
		System.out.println("case2:"+s1==s2);

	}

}
