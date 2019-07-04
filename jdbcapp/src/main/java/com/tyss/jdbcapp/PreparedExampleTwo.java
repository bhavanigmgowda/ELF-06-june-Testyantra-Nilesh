
package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import lombok.extern.java.Log;;

@Log
public class PreparedExampleTwo {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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

			log.info("Connection class" + connection.getClass());
			// Issue "SQL" quries via connection
			String qry = "select * from employee_info" + " where ID=?"
					+ " and MNGR_ID=?";
			log.info(qry);

		
			pstmt = connection.prepareStatement(qry);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setInt(2, Integer.parseInt(args[1]));
			 
			rs = pstmt.executeQuery();
			// process the result
			while (rs.next()) {

				log.info(" ID       		===>  " + rs.getInt("ID"));
				log.info(" NAME    	        ===>  " + rs.getString("NAME"));
				log.info(" AGE    			===>  " + rs.getInt("AGE"));
				log.info(" GENDER 			===>  " + rs.getString("GENDER"));
				log.info(" SALARY   		===>  " + rs.getDouble("SALARY"));
				log.info(" PHONE    		===>  " + rs.getLong("PHONE"));
				 log.info(" JOINING_DATE ===> " + rs.getDate("JOINING_DATE"));
				// log.info(" ACCOUNT_NO ===> " + rs.get("ACCOUNT_NO"));
				log.info(" EMAIL      		===>  " + rs.getString("EMAIL"));
				log.info(" DESIGNATION 		===>  " + rs.getString("DESIGNATION"));
				log.info(" DOB         		===>  " + rs.getDate("DOB"));
				log.info(" DEPT_ID  		===>  " + rs.getInt("DEPT_ID"));
				log.info(" (MANAGER_ID)		===>  " + rs.getInt("MNGR_ID"));

			}
		} catch (Exception e) {
			log.severe("" + e);
		} finally {
			try {

				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
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
