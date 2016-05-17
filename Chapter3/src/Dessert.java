//Part 1.3
import java.util.Scanner;

public class Dessert {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		final double COFFEE_CAKE_PRICE = 2.99;
		final double CHEESE_CAKE_PRICE = 3.99;
		final double CARROT_CAKE_PRICE = 1.99;
		double totalPrice = 0.0;
		
		System.out.println("Choose from this menu:");
		System.out.println("1. Coffee Cake: ");
		System.out.println("2. Cheese Cake: ");
		System.out.println("3. Carrot Cake: ");
		System.out.println("4. Done Ordering: ");
		choice = keyboard.nextInt();
		
		while (choice != 4){
			
			switch (choice){
			case 1:
				totalPrice += COFFEE_CAKE_PRICE;
				break;
				
			case 2:
				totalPrice += CHEESE_CAKE_PRICE;
				break;
				
			case 3:
				totalPrice += CARROT_CAKE_PRICE;
				break;
				
			case 4:
				break;
		
			default: 
				System.out.println("That's not on the menu!");
				
				
			}
			
			System.out.println("Choose from this menu:");
			System.out.println("1. Coffee Cake: ");
			System.out.println("2. Cheese Cake: ");
			System.out.println("3. Carrot Cake: ");
			System.out.println("4. Done Ordering: ");
			choice = keyboard.nextInt();
		}
		System.out.println("Your total order is $" + totalPrice);
				
	}

}
