package com.ricks.service;

public interface AccountService {

	public int deposit(int accNo, Double amount);

	public int withdraw(int accNo, Double amount);
		
}
