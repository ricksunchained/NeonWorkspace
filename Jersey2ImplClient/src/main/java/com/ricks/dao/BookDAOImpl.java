package com.ricks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ricks.domain.Book;
import com.ricks.util.ConnectionFactory;

public class BookDAOImpl implements BookDAO {

	public int registerBook(Book book) {
		Connection con = ConnectionFactory.getInstance();
		String sql = "insert into book values(?,?,?,?)";
		int count = 0;
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		return count;
	}

}
