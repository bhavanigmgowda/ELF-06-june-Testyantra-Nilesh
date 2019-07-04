package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import lombok.extern.java.Log;;
@Log
public class InsertExample {
    
        public static void main(String[] args) {
			
		
	Connection connection = null;
	Statement statement = null;
	ResultSet rs= null;
	try {
		/*
		 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
		 * DriverManager.registerDriver(driver);
		 */

		Class.forName("com.mysql.jdbc.Driver").newInstance();
		// fullyQualified class name provided by vendor

		// get the db connection

		// String dbUrl = "jdbc:mysql://
		// 10.10.13.234:3306/tech_chefs_db?user=root&password=root";
		// connection = DriverManager.getConnection(dbUrl);

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
		
		 log.info("Connection class"+connection.getClass());
		// Issue "SQL" quries via connection
		//String qry = "select * from employee_info where id=1";
		String qry1="insert into employee_info values"
				+ "(37,'Nagesh',25,'male',"
				+ "2521,8889885548,'2018-04-08',5897848444,'ramesh@gmail.com',"
				+ "'tester','1995-04-8',8,5)";
				
		statement = connection.createStatement();

		int result = statement.executeUpdate(qry1);
		// process the result
		
		log.info(""+result);
		
	} catch (Exception e) {
		log.severe("" + e);
	} finally {
		try {

			if (rs != null) {
				rs.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}

		} catch (Exception e) {
			log.severe("" + e);
		}

	}

}
}




