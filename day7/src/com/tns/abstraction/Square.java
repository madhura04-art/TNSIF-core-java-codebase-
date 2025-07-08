package com.tns.abstraction;

public class Square extends shape {
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	public Square() {
		side= 4;
	}

	@Override
	public void calArea() {
		this.area= side*side;
		
	}
}
