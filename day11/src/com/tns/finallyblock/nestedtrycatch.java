package com.tns.finallyblock;

public class nestedtrycatch {
        public static void Check() {
	    String str="tns";
	    int slen= str.length();
	    String otherstr = null;
	    
	    int y=3;
	    try {
	    		    	
	    	try {
	    		System.out.println(str.charAt(y));
	    	}
	    	catch(StringIndexOutOfBoundsException e) {
	    		System.out.println(e.getMessage());
	    	}
	    	System.out.println(otherstr.length());	    	
	    }
	    catch (Exception e) {
	    	System.err.println(e.getMessage());
	    	
	    }
  }
}
