package com.tns.overriding;

public class SBI extends RBI {
	
	public Float getRateOfinterest() {
        System.out.println("base rate of interest");
		return 1.3f;
	}

}
