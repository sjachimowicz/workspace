import java.util.Scanner;

public class PartC {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter the diameters of Pizza A and Pizza B");
		int pizzaA = input.nextInt();
		int pizzaB = input.nextInt();

		System.out.println(" Now enter the prices of Pizza A and Pizza B");

		double costA = input.nextDouble();
		double costB = input.nextDouble();

		double areaA, areaB;
		areaA = (Math.PI * Math.pow(pizzaA, 2)) / 4;
		areaB = (Math.PI * Math.pow(pizzaB, 2)) / 4;

		double priceA, priceB;
		priceA = costA / areaA;
		priceB = costB / areaB;

		System.out.printf("The price per square inch for Pizza A is: $%.2f ", priceA);
		System.out.printf("\nThe price per square inch for Pizza B is: $%.2f ", priceB);

		if (priceA < priceB) {
			System.out.println("\nPizza A is the better buy");
		} else {
			System.out.println("\nPizza B is the better buy");
		}

	}

}
