package assignment9;

public class Address {
	private String streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String postalCode;

	public Address(int streetNumber, String streetName, String city, String state, int postalCode) {
		setStreetNumber("" + streetNumber);
		setStreetName(streetName);
		setCity(city);
		setState(state);
		setPostalCode("" + postalCode);
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String toString() {
		return streetNumber + " " + streetName + "\n" + city + " " + state + " " + postalCode;
	}
}
