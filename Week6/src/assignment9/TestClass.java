//Part 4
package assignment9;

public class TestClass {

	public static void main(String[] args) {
		Telephone myNumber = new Telephone(352, "5841423");
		Address myAddress = new Address(12192, "Shady Spring Way", "Orlando", "Florida", 32828);
//		Person myContact = new Person("Steven Jachimowicz", myAddress, myNumber, "stevejachimo@gmail.com");
//		System.out.println(myNumber);
//		System.out.println(myAddress + "\n");
//		System.out.println(myContact);
		Telephone seanTelephone = new Telephone(754, "4569981");
		Address seanAddress = new Address(1234, "Royal Oak Drive", "Chicago", "IL", 23231);
		Telephone janeNumber = new Telephone( 882, "2347171");
		Address janeAddress = new Address(4443, "Cumberland Lane", "Phoenix", "AR", 88822);
		Clerk sean = new Clerk("Sean Doe", seanAddress, seanTelephone, "seandoe@gmail.com", 35000, "G-4");
		Clerk steven = new Clerk("Steven Jachimowicz", myAddress, myNumber, "stevejachimo@gmail.com", 42000, "H-4");
		Clerk jane = new Clerk("Jane Roland", janeAddress, janeNumber, "janeRoland@gmail.com", 35000, "G-4");
		
//		if( sean.equals(steven)){
//			System.out.println("Sean and Steven are equal Clerks!");
//		} else{ 
//			System.out.println("Sean and Steven are NOT equal Clerks!");
//		}
//		if(jane.equals(sean)){
//			System.out.println("Jane and Sean are equal Clerks!");
//		} else{
//			System.out.println("Jane and Sean are NOT equal Clerks!");
//		}
//		System.out.println(steven);
//		System.out.println(sean);
//		System.out.println(jane);
		
//		System.out.println(steven.getAddress());
		seanAddress.setPostalCode("44444");
//		System.out.println(sean.getAddress());
		
		String book = "Game of Thrones";
		Integer number = 3456;
		
		System.out.println(book.getClass());
		System.out.println(number.getClass());
		System.out.println(steven.getClass());
		
		System.out.println(sean);
		
		if(sean instanceof Person){
			System.out.println(" Yes sean is an instance of Person");
		}
		if( seanAddress instanceof Person){
			
		}
		if(book instanceof String){
			System.out.println("Book is an instance of String");
		}
		
		if( seanAddress instanceof Object){
			
		}

	}
	
	
	
		
	}


