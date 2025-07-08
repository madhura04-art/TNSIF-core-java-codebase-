package com.tns.overloading;

public class Point {
	 private Float x;
	 private Float y;
	public Point() {
		x=0.01f;
		y=0.01f;
	}
	
	public Point(Float x) {
		super();
		this.x = x;
	}

	public Point(Float x, Float y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	 
	 
	
   

}
