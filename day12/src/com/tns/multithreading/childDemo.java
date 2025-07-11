package com.tns.multithreading;

public class childDemo  extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    childThread td= new childThread(10,"hello");
    childThread td1= new childThread(5,"TNSIF");
    td.start();
    td1.start();
    System.out.println("");
	}

}
