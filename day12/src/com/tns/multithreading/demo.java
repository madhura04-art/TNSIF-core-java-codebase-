package com.tns.multithreading;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Thread myThread=new TreadlifeCycle();
	    
		System.out.println("before runnable state Thread is Alive :  "+myThread.isAlive());
		myThread.start();
		
		try {
			
			Thread.sleep(450);
		}
		catch (InterruptedException e) {
			 
			 System.out.println("interupted"+e.getMessage());		 
		 }
		System.out.println("After completion execution, it is alive or not ?: "
				+myThread.isAlive());
	}

}
