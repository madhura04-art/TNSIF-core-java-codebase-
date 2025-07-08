package com.tns.abstraction;

public abstract class shape {
	 protected  Float area;
	public abstract void calArea();
	public void Show() {
		System.out.println("area of shape:"+area);
	}

}
