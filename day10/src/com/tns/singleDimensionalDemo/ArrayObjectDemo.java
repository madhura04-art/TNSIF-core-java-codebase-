package com.tns.singleDimensionalDemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student st = new student();
      student []arr;
      arr=new student[5];
      arr[0]=new student(101,"heti");
      arr[1]=new student(102,"marii");
      arr[2]=new student(103,"niti");
      arr[3]=new student(104,"riya");
      arr[4]=new student(105,"vina");
      
      for (int i =0 ; i<=4 ;i++) {
      System.out.println("element at position :"+i);
      st.setRollno(i);
     // st.getName(i);
      System.out.println("roll no: "+st.getRollno()+"name: "+st.getName());
      } 
	}

}
