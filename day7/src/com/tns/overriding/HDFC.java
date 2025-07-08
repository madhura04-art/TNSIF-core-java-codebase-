package com.tns.overriding;

public class HDFC extends RBI {
	public Float getRateOfinterest() {
        System.out.println("base rate of interest");
		return 1.5f;
	}

}
