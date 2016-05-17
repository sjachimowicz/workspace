import java.util.Scanner;

public class PartB {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius of a circle");
		double radius = input.nextDouble();
		
		double diameter = radius * 2;
		double circumfrence = Math.PI * diameter;
		double area = Math.PI * Math.pow(radius, 2);
		double volume = ((4 * Math.PI)/ 3) * Math.pow(radius, 3);
		
		System.out.println("The diameter is: " + diameter);
		System.out.println("The circumfrence is: " + circumfrence);
		System.out.println("The area is: " + area);
		System.out.println("The volume is: "+ volume);

	}

}
