package com.tns.singleDimensionalDemo;

import java.util.*;

public class Arrayclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int intarr[]= {69,20,12,40 ,35};
      System.out.println(Arrays.toString(intarr));
       
       for  (int i=0;i<=4; i++) {
    	   System.out.println(intarr[i]+" ");
       }
       
      Arrays.sort(intarr);
      System.out.println(Arrays.toString(intarr));
    	  
      System.out.println(Arrays.binarySearch(intarr,9));
       
       int intarr1[]= {69,20,12,40 ,35};
       
       int intarr2[]= Arrays.copyOf(intarr,2);
       System.out.println(intarr2);
       
       
       
	}

}
