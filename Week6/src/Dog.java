
public class Dog extends Animal {

	private String name;
	
	public Dog(int weight, String name){
		super(weight);
		setName(name);
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Dog)){
			return false;
		}
		boolean result = false;
		
		if(this.getWeight() == ((Dog)obj).getWeight() ){
			result = true;
		}

		return result;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		String result;
		result = "Dog: " + name + super.toString() + getWeight();
		return result;
	}
//	Telephone myNumber = new Telephone(352, "5841423");
//	Address myAddress = new Address(12192, "Shady Spring Way", "Orlando", "Florida", 32828);
//	Person myContact = new Person("Steven Jachimowicz", myAddress, myNumber, "stevejachimo@gmail.com");
//
//	System.out.println(myNumber);
//	System.out.println(myAddress + "\n");
//	System.out.println(myContact);
}
