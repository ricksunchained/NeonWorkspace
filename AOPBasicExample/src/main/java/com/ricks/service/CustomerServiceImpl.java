package com.ricks.service;

public class CustomerServiceImpl implements CustomerService {

	private String url, name;

	public void setUrl(String url) {
		this.url = url;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String printUrl() {
		System.out.println("Entered into PrintUrl Method");
		return url;
	}
	public void printException() throws InterruptedException {
		throw new InterruptedException("Do not sleep in the class...");

	}
	public String printName(String name) {
		System.out.println("entered into printName method");
		return name;
	}

}
