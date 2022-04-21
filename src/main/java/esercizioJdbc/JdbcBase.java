package esercizioJdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBase {
	
	static String usr = "root";
	static String pwd = "password";
	static String db = "world";
	static String driverName = "com.mysql.cj.jdbc.Driver";
	static String path = "jdbc:mysql://localhost:3306/"+ db + "?"+ "user="+ usr + "&password="+ pwd;
	
	public static Connection connect() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		Class<?> driver = Class.forName(driverName);
		driver.getDeclaredConstructor().newInstance();
		Connection conn =  DriverManager.getConnection(path);
	    return conn;
	}
	
	


}
