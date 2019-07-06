
package com.tyss.designpattern.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import com.tyss.designpattern.bean.EmployeeInfoBean;

import java.sql.ResultSet;
import lombok.extern.java.Log;;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String qry = "select * from employee_info";

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/tyss","root","root");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(qry);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		
			ArrayList<EmployeeInfoBean> arrayList=new ArrayList<>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoining_date(rs.getDate("JOINING_DATE"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDept_ID(rs.getInt("DEPT_ID"));
				bean.setManager_ID(rs.getInt("MNGR_ID"));
				
				arrayList.add(bean);

			}
			return arrayList;
		} catch (Exception e) {
			log.severe("" + e);
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeInfo(String args) {

		try {
			return getEmployeeInfo(Integer.parseInt(args));
		} catch (Exception e) {
			log.severe("" + e);
			return null;
		}

	}//

	public EmployeeInfoBean getEmployeeInfo(int id) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			/*
			 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
			 * DriverManager.registerDriver(driver);
			 */
			EmployeeInfoBean bean = new EmployeeInfoBean();
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// fullyQualified class name provided by vendor

			// get the db connection

			// String dbUrl = "jdbc:mysql://
			// 10.10.13.234:3306/tech_chefs_db?user=root&password=root";
			// connection = DriverManager.getConnection(dbUrl);

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");

			log.info("Connection class" + connection.getClass());
			// Issue "SQL" quries via connection
			String qry = "select * from employee_info" + " where ID=?";
			log.info(qry);

			pstmt = connection.prepareStatement(qry);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
		
			
			// process the result
			while (rs.next()) {

				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoining_date(rs.getDate("JOINING_DATE"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDept_ID(rs.getInt("DEPT_ID"));
				bean.setManager_ID(rs.getInt("MNGR_ID"));

			}
			return bean;
		} catch (Exception e) {
			log.severe("" + e);
			return null;
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

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}// end of class
