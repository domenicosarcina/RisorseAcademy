package jdbc.examplePureJdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQuery {
	public static ResultSet executeQuery(String query) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		ResultSet rs = null;
		String result = null;
		try (Statement stmt = JdbcConnection.connect().createStatement()) {
	      rs = stmt.executeQuery(query);
	    } catch (SQLException e) {
	    	
	    }
		return rs ;
	}
}
