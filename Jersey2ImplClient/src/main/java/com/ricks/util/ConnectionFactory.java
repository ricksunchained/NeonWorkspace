package com.ricks.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static Connection getInstance() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		}

	}
}
