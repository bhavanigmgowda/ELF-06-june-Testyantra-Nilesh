
package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.Driver;
import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class MyFirstJdbcTryWithResoures {
	public static void main(String[] args) {

		String qry = "select * from employee_info";

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/testyantra_db", "root",
				"password");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(qry);) {

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			while (rs.next()) {

				log.info(" ID       		===>  " + rs.getInt("ID"));
				log.info(" NAME    	        ===>  " + rs.getString("NAME"));
				log.info(" AGE    			===>  " + rs.getInt("AGE"));
				log.info(" GENDER 			===>  " + rs.getString("GENDER"));
				log.info(" SALARY   		===>  " + rs.getDouble("SALARY"));
				log.info(" PHONE    		===>  " + rs.getLong("PHONE"));
				// log.info(" JOINING_DATE ===> " + rs.getDate("JOINING_DATE"));
				// log.info(" ACCOUNT_NO ===> " + rs.get("ACCOUNT_NO"));
				log.info(" EMAIL      		===>  " + rs.getString("EMAIL"));
				log.info(" DESIGNATION 		===>  " + rs.getString("DESIGNATION"));
				log.info(" DOB         		===>  " + rs.getDate("DOB"));
				log.info(" DEPT_ID  		===>  " + rs.getInt("DEPT_ID"));
				log.info(" (MANAGER_ID)		===>  " + rs.getInt("MNGR_ID"));

			}
		} catch (Exception e) {
			log.severe("" + e);
		}
	}

}// end of class
