package com.tyss.connectionpool;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.util.Properties;

public class ConnectionPool {

	Vector<Connection> pool;
	private int poolSize;
	private String dbUrl;
	private String usernm;
	private String password;
	private String driverclassNM;

	private static ConnectionPool poolRef=null;

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private ConnectionPool() throws Exception {
	
		getProperties();
		createPool();
	}

	

	public Connection getConnectionFromPool() // get connection from pool
	{
		//Connection con = pool.get(0);
		return pool.remove(0); // return remove object
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

	private void getProperties() throws Exception {
		
		Properties propertiesRead = new Properties();
		propertiesRead.load(new FileInputStream("ConnectionPool.properties"));

		String pz=PropertiesUtil.getProperties().getProperty(ConnectionPoolConstants.POOLSIZE);
		poolSize=Integer.parseInt(pz);
		usernm=PropertiesUtil.getProperties().getProperty(ConnectionPoolConstants.USERNAME);
		password=PropertiesUtil.getProperties().getProperty(ConnectionPoolConstants.PASSWORD);
		dbUrl=PropertiesUtil.getProperties().getProperty(ConnectionPoolConstants.DBURL);
		driverclassNM=PropertiesUtil.getProperties().getProperty(ConnectionPoolConstants.DRIVERCLASSNAME);


	}

	private void createPool() throws Exception {
		pool=new Vector<>();
		Connection con=null;
		Class.forName(driverclassNM);
		for (int i = 0; i < poolSize; i++) {
			
			con = DriverManager.getConnection(dbUrl, usernm, password);
			pool.add(con);
		}
	}
	
	
}
