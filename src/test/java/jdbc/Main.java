package jdbc;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import jdbc.examplePureJdbc.JdbcConnection;
import jdbc.examplePureJdbc.JdbcQuery;
//import hibernate.exampleWithXML.dao.*;
import jdbc.exampleWithDao.dao.*;
import jdbc.exampleWithDao.model.City;

public class Main {
	
	@Test
	public void testJdbcBase() {
		String result = null;
		try {
			result = JdbcConnection.connect().getCatalog();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | SQLException e) {
			e.printStackTrace();
		}
		assertEquals("world",result);
	}
	
	@Test
	public void testQuery() {
		try {
			ResultSet rs = JdbcQuery.executeQuery("SELECT * FROM country");
			assertTrue(rs.getMetaData().getColumnCount() > 0);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testJdbcDao() {
		CityDao cityDao = new CityDaoImpl();
		assertEquals(4079,cityDao.getCities().size());
	}
	
	
	/*@Test
	public void testHibernateXmlHql() {
		CityDao cityDao = new CityDaoImpl();
		assertEquals(4079,cityDao.getCities().size());
	}*/
}
