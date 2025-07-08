package com.tns.abstraction;

public class rectangle extends shape{
	float width;
	float height;
	
	public rectangle() {
		width= 3.2f;
		height=2.0f;
		
	}

	public rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void calArea() {
		this.area= width* height;
		
	}
	

}
