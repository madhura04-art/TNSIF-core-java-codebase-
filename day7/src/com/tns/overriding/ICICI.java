package com.tns.overriding;

public class ICICI extends RBI{
	public Float getRateOfinterest() {
        System.out.println("base rate of interest");
		return 1.4f;
	}
}
