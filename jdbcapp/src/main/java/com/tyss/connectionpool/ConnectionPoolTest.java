package com.tyss.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Driver;
import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class ConnectionPoolTest {

	public static void main(String[] args) {
		ConnectionPool cp = null;
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			cp = ConnectionPool.getConnectionPool();
			con = cp.getConnectionFromPool();

			// Issue "SQL" quries via connection
			String qry = "select * from employee_info";
			statement = con.createStatement();

			rs = statement.executeQuery(qry);
			// process the result
			while (rs.next()) {

				log.info(" ID       		===>  " + rs.getInt("ID"));
				log.info(" NAME    	        ===>  " + rs.getString("NAME"));
				log.info(" AGE    			===>  " + rs.getInt("AGE"));
				log.info(" GENDER 			===>  " + rs.getString("GENDER"));
				log.info(" SALARY   		===>  " + rs.getDouble("SALARY"));
				log.info(" PHONE    		===>  " + rs.getLong("PHONE"));
				log.info(" EMAIL      		===>  " + rs.getString("EMAIL"));
				log.info(" DESIGNATION 		===>  " + rs.getString("DESIGNATION"));
				log.info(" DOB         		===>  " + rs.getDate("DOB"));
				log.info(" DEPT_ID  		===>  " + rs.getInt("DEPT_ID"));
				log.info(" (MANAGER_ID)		===>  " + rs.getInt("MNGR_ID"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				cp.returnConnectionToPool(con);
				if (statement != null) {
					statement.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
			}

		}
	}

}// end of class
