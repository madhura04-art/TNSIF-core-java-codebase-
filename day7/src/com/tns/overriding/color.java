package com.tns.overriding;

public class color {
	protected color getcolor() {
		color s= new color();
		return s;
	}
}	
class red extends color{
	
		protected red getcolor() {
			red s = new red();
			return s;	
		}
	}
class yellow extends color{
	protected yellow getcolor() {
		yellow s = new yellow();
		return s;
		
	}
}


