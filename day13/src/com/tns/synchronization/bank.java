package com.tns.synchronization;

public interface bank {
	static final int MINBAl=5000;
	static final int DAILY_LIMIT=25000;
	void deposit (int amt) throws depositteLimitException;
	void withdraw(int amt) throws InsufficientBalance;
     
}
