package com.risorse.jdbc;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.risorse.jdbc.JdbcBase;
import com.risorse.jdbc.JdbcQuery;

public class Main {
	
	@Test
	public void testJdbcBase() {
		JdbcBase jdbcBase = new JdbcBase();
		String result = null;
		try {
			result = jdbcBase.connect().getCatalog();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | SQLException e) {
			e.printStackTrace();
		}
		assertEquals("world",result);
	}
	
	@Test
	public void testQuery() {
		try {
			ResultSet rs = JdbcQuery.esecuteQuery("SELECT * FROM country");
			assertTrue(rs.getMetaData().getColumnCount() > 0);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | SQLException e) {
			e.printStackTrace();
		}
	}

}
