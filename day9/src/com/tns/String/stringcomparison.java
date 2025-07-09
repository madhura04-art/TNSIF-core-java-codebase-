package com.tns.String;

public class stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "tnsif";
		String s2="TNSIF";
		String s3 = new String("TNSIF");
		String s4= new String("TNSIF");
		
		System.out.println("case 1 s1==s2 :"+ s1==s2);
		System.out.println("case 2 s1==s3:"+ s1==s3);
		System.out.println("case 3 s2.equals(s1):"+ s2.equals(s1));
		System.out.println("case 4 s2.equals(s4):"+ s2.equals(s4));
		System.out.println("case 5 s3==s4:"+ s3==s4);
		System.out.println("case 6 s3.equals(s4):"+ s3.equals(s4));
		
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1.compareTo(s4));
		
        System.out.println(s1.compareToIgnoreCase(s4));
	}

}
