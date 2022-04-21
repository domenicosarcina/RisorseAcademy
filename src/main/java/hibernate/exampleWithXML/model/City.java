package hibernate.exampleWithXML.model;

public class City {
	private int ID;
	private String name;
	private String countryCode;
	private String district;
	private String population;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Override
	public String toString() {
		return "City [ID=" + ID + ", name=" + name + ", countryCode=" + countryCode + ", district=" + district
				+ ", population=" + population + "]";
	}
	
}
