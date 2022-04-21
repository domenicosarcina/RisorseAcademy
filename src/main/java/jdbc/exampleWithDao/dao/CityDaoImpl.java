package jdbc.exampleWithDao.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import jdbc.exampleWithDao.JdbcConnection;
import jdbc.exampleWithDao.model.City;

public class CityDaoImpl implements CityDao {

	@Override
	public Collection<City> getCities() {
		Collection<City> cityList = new ArrayList<>();
		ResultSet rs = null;
		String result = null;
		try (Statement stmt = JdbcConnection.connect().createStatement()) {
	      rs = stmt.executeQuery("SELECT * FROM city");
	      while(rs.next()) {
	    	  
		      City newCity = new City();
		      newCity.setID(rs.getInt("ID"));
		      newCity.setCountryCode(rs.getString("CountryCode"));
		      newCity.setDistrict(rs.getString("District"));
		      newCity.setName(rs.getString("Name"));
		      newCity.setPopulation(rs.getString("Population"));
		      
		      cityList.add(newCity);
	      }
	    } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
	    	System.out.println(e.getMessage());
	    }
		return cityList;
	}

	@Override
	public City getCity(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City getCityByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

