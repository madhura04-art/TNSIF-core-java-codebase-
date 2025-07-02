package com.tns.secondpackage;
import com.tns.firstpackage.*;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Base b1= new Base();
        
        b1.methodPublic();
        b1.varPublic =200;
        b1.methodPublic();
	}

}
