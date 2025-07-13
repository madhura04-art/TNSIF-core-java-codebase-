package com.tns.synchronization;

public class depositteLimitException extends Exception{
	public depositteLimitException()
	{
		super("Daily Limit of deposit is exceed.....");
	}
	public depositteLimitException(String message )
	{
		super (message);
	}

}
