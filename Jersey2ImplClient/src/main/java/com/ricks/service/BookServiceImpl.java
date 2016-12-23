package com.ricks.service;

import com.ricks.dao.BookDAOFactory;
import com.ricks.domain.Book;

public class BookServiceImpl implements BookService {

	public int registerBook(Book book) {
		return BookDAOFactory.getInstance().registerBook(book);
	}

}
