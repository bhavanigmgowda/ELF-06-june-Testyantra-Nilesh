
package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import lombok.extern.java.Log;;
@Log
public class PreparedStatementExampleThree {
    
        public static void main(String[] args) {
			
		
	Connection connection = null;
	PreparedStatement stmt = null;
	
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
		String qry1="insert into employee_info (ID,NAME,DEPT_ID,MNGR_ID,DOB ) values"
				+ "(?,?,?,?,?)";
				
		  stmt = connection.prepareStatement(qry1);
		  stmt.setInt(1,Integer.parseInt(args[0]));
		  stmt.setString(2,args[1]);
		  stmt.setInt(3,Integer.parseInt(args[2]));
		  stmt.setInt(4,Integer.parseInt(args[3]));
		  stmt.setString(5,args[4]);

		int result = stmt.executeUpdate();
		// process the result
		
		log.info(""+result);
		
	} catch (Exception e) {
		log.severe("" + e);
	} finally {
		try {

			
			if (stmt != null) {
				stmt.close();
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




