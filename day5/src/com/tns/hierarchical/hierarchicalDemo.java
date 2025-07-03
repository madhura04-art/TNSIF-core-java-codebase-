package com.tns.hierarchical;

public class hierarchicalDemo {
    public static void main (String args[]) {
    	Person p1=new Person();
    			System.out.println(".......peson detail.......");
    	        System.out.println(p1);
    	//Student s1= new Student()
    	        Person p;
    	        p = new Person("madhura","pune");
    	  p = new Student("third B","80%","madhura","pune") ;
    	  System.out.println(p);
    	  p=new Employee( 100000.00f, 2,"finance","Raj", "nagpur");
    	  System.out.println(p);
    }
}