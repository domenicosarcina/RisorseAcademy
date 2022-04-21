package hibernate.exampleWithXML.dao;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import jdbc.exampleWithDao.model.City;

public class CityDaoImpl implements CityDao {
	private static StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	private static Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	private static SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
	private static Session session;

	@Override
	public Collection<City> getCities() {
		session = factory.openSession();
		String hql = "from City";
		Query q = session.createQuery(hql);
		Collection<City> cities = q.list();
		return cities;
	}

	@Override
	public City getCity(Integer id) {
		return null;
	}

	@Override
	public City getCityByName(String name) {
		return null;
	}

}
