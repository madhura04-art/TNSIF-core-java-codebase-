package com.tns.multithreading;

public class childThread  extends Thread{
 int n;
 String msg;
public childThread(int n, String msg) {
	super();
	this.n = n;
	this.msg = msg;
}
 public void  run() {
	 for( int i= 1;i<=n;i++) {
		 try {
			 Thread.sleep(1000);
		 }
		 catch(InterruptedException e) {
			 System.err.println(e.getMessage());
		 }
		 System.out.println(i+ msg);
	 }
	 
 }
}
