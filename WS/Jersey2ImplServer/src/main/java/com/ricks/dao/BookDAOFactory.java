package com.ricks.dao;

public class BookDAOFactory {

	public static BookDAOImpl getInstance() {
		return new BookDAOImpl();
	}

}
