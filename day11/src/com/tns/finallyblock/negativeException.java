package com.tns.finallyblock;

public class negativeException extends Exception {
	public negativeException(String String ) {
		super(String);
	}
	public negativeException() {
		System.out.println("percentage should not be 0");
	}

}
