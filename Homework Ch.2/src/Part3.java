//Part 3
import java.util.Scanner;
public class Part3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length and width (in feet) of a rectangular area: ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double land;
		final double ACRE = 43560;
		
		double area = length * width;
		
		if( area >= 0){
			land = area / ACRE;
			System.out.printf(" The total acreage is %10.2f", land);
		}
		else{
			System.out.println("ERROR- Amount entered is negative");
		}
	}

}
