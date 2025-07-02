package com.tns.firstpackage;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Base b1= new Base();
        b1.methodDefault();
        b1.methodPublic();
    //  b1.methodPrivate(); private member are not accesible outside the class
        b1.methodProtected();
        
        b1.varDefault=22;
        b1.methodDefault();
        
        b1.varPublic=100;
        b1.methodPublic();
	}

}
