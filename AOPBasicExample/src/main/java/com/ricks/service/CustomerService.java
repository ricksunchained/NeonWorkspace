package com.ricks.service;

public interface CustomerService {
	public String printName(String name);

	public String printUrl();

	public void printException()throws InterruptedException;

}
