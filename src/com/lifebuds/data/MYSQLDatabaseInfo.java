package com.lifebuds.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MYSQLDatabaseInfo implements DatabaseInfo {

	private Connection connection = null;
	public static String DRIVER_NAME;
	static DatabaseInfo baseInfo;
	public PreparedStatement statement;

	public MYSQLDatabaseInfo() {
	}

	@Override
	public String getDriverName() {

		DRIVER_NAME = "com.mysql.jdbc.Driver";
		return DRIVER_NAME;
	}

	@Override
	public String getPassword() {

		String password = "sa";
		return password;
	}

	@Override
	public String getURL() {

		return new StringBuilder().append("jdbc:mysql://").append("localhost")
				.append(":").append("3306").append("/").append("db_organ")
				.append("?user=").append("root").append("&password=")
				.append("sa").toString();
	}

	@Override
	public String getUserName() {

		String userName = "root";

		return userName;
	}

	public Connection getConnection() {
		MYSQLDatabaseInfo mBaseInfo = new MYSQLDatabaseInfo();
		try {
			DRIVER_NAME = mBaseInfo.getDriverName();
			Class.forName(DRIVER_NAME);
			System.out
					.println("Connector loaded successfully//////////?????????");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			connection = DriverManager.getConnection(mBaseInfo.getURL());
		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}

		return connection;
	}

	public void closeDBResource() {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
