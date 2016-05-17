//Part 2
import java.util.Scanner;
public class Chapter2work {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double discount;
	
		System.out.println("Enter the number of packages purchased: ");
		double p = input.nextDouble();
	
		double total = p * 99;
		System.out.println("Your total without discount: $"+ total);
		
		if (p <= 19 && p >= 0){
			discount = total * 0.2;
			System.out.println("The discount is: $"+ discount);
			System.out.println("The discounted total: $"+ (total - discount));
			
		}
		if (p >= 20 && p <= 49){
			discount = total * 0.33;
			System.out.println("The discount is: $"+ discount);
			System.out.println("The discounted total: $"+ (total - discount));
		}
		if (p >= 50 && p <= 99){
			discount = total * 0.42;
			System.out.println("The discount is: $"+ discount);
			System.out.println("The discounted total: $"+ (total - discount));
		}
		if (p >= 100){
			discount = total * 0.49;
			System.out.println("The discount is: $"+ discount);
			System.out.println("The discounted total: $"+ (total - discount));
		}
		
		
		

	}

}
