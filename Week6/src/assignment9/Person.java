package assignment9;

public class Person {
	private String name;
	private Address address;
	private Telephone telephone;
	private String email;
	

	public Person(String name, Address address, Telephone telephone, String email) {
		setName(name);
		setAddress(address);
		setTelephone(telephone);
		setEmail(email);
		
	}
	
	public boolean equals(Object obj){
		if((obj instanceof Person)){
			return true;
		}
		
		boolean result = false;
		return result;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Contact Name: " + name + "\n" + "Telephone Number: " + telephone + "\n" + "Address: " + address + "\n"
				+ " Email: " + email;
	}

}
