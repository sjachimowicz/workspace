
public class PartA {

	public static void main(String[] args) {

		System.out.println("hello");

		double variable;

		variable = Math.sqrt(100.0) + 45.6;

		System.out.println("The square root of 100 + 45.6 is: " + variable);

		System.out.println("2 to the 3rd power: " + Math.pow(2.0, 3.0));
		System.out.println("10 to the 32nd power: " + Math.pow(10.0, 32.0));
		System.out.println(Math.PI);

		String name = new String("Colin");
		int stringLength = name.length();
		System.out.println("len has : " + stringLength);
		
		char myChar = name.charAt(3);
		System.out.println(myChar);
	}

}
