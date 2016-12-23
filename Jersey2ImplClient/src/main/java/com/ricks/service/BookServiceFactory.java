package com.ricks.service;

public class BookServiceFactory {
	public static BookServiceImpl getInstance() {
		return new BookServiceImpl();
	}

}
