package gr.aueb.cf.schoolapp.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBUtil {
	
	private static BasicDataSource ds = new BasicDataSource();
	
	private static Connection connection;
	
	static {
		ds.setUrl("jdbc:mysql://localhost/edudb?serverTimeZone=UTC");
		ds.setUsername("Kanellos");
		ds.setPassword(System.getenv("PASS_EDUDB"));
		ds.setInitialSize(10);
		ds.setMaxTotal(50);
		ds.setMinIdle(8);
		ds.setMaxIdle(10);
	}

	/**
	 * No instances of this class should be available.
	 */
	private DBUtil() {
			
	}
	
	public static Connection getConnection() throws SQLException {
		connection = ds.getConnection();
		return connection;
	}
	
	public static void closeConnection() {
		try {
			if (connection != null) connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
