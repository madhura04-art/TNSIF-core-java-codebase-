package com.tns.multithreading;

public class ThreadmethodDemo {
	public static void main(String args[]) {
	 childThread t1= new childThread(5,"first");
	 childThread t2= new childThread(10,"Second");
	 t1.start();
	 t2.start();
	 Thread.currentThread().setName("parent thread");
	 Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	 System.out.println("current tread ");
	 try {
		 t1.join();
		 t2.join();
	 }
	 catch (InterruptedException e) {
		 Thread.currentThread().interrupt();
		 System.out.println("interupted"+e.getMessage());		 
	 }
	 System.out.println("end of the Program");
	}
}
