package com.techchefs.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.mysql.jdbc.Driver;
import com.techchefs.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String query = "Select * from employee_info";

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech_chefs_db", "root",
				"root");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfoBean> employeeList = new ArrayList<EmployeeInfoBean>();

			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setAccount_number(rs.getLong("Account_number"));
				bean.setAge(rs.getInt("Age"));
			//	bean.setDepartmentId(rs.getInt("DepartmentId"));
				bean.setDesignation(rs.getString("Designation"));
				bean.setDob(rs.getDate("Dob"));
				bean.setEmail(rs.getString("Email"));
				bean.setGender(rs.getString("Gender"));
				bean.setId(rs.getInt("Id"));
				bean.setJoining_date(rs.getDate("Joining_date"));
			//	bean.setManagerId(rs.getInt("ManagerId"));
				bean.setName(rs.getString("Name"));
				bean.setPhone(rs.getLong("Phone"));
				bean.setSalary(rs.getDouble("Salary"));
				
				employeeList.add(bean);
			}
			return employeeList;

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			return null;

		}

	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {

		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech_chefs_db", "root", "root");
			String query = "select * from employee_info where id=?";/* + " and mngr_id=?"; */
			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			// stmt.setInt(2, mngr_id);
			rs = stmt.executeQuery();

			EmployeeInfoBean bean = new EmployeeInfoBean();

			while (rs.next()) {
				bean.setAccount_number(rs.getLong("Account_number"));
				bean.setAge(rs.getInt("Age"));
		//		bean.setDepartmentId(rs.getInt("DepartmentId"));
				bean.setDesignation(rs.getString("Designation"));
				bean.setDob(rs.getDate("Dob"));
				bean.setEmail(rs.getString("Email"));
				bean.setGender(rs.getString("Gender"));
				bean.setId(rs.getInt("Id"));
				bean.setJoining_date(rs.getDate("Joining_date"));
			//	bean.setManagerId(rs.getInt("ManagerId"));
				bean.setName(rs.getString("Name"));
				bean.setPhone(rs.getLong("Phone"));
				bean.setSalary(rs.getDouble("Salary"));

			}
			return bean;

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			return null;

		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

	@Override
	public ArrayList<EmployeeInfoBean> getEmployeeIds(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
