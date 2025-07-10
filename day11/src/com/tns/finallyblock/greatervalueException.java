package com.tns.finallyblock;

public class greatervalueException extends Exception {
	public greatervalueException(String String ) {
		super(String);
	}
	public greatervalueException() {
		System.out.println("percentage should not greater than 100 ");
	}

}
