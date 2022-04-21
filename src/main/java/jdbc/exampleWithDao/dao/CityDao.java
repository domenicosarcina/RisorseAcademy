package jdbc.exampleWithDao.dao;

import java.util.Collection;

import jdbc.exampleWithDao.model.City;

public interface CityDao {
	public Collection<City> getCities();
	public City getCity(Integer id);
	public City getCityByName(String name);
}
