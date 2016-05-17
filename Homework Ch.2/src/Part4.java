//Part4
import java.util.Scanner;
public class Part4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letter;
		
		System.out.println("Enter your letter grade (A-F)");
		letter = input.next ().charAt(0);
		
		switch (letter){
		case 'A':
			System.out.println("You must have have scored 90.0 - 100");
			break;
		case 'B':
			System.out.println("You must have scored 80.0 - 89.9");
			break;
		case 'C':
			System.out.println("You must have scored 70.0 - 79.9");
			break;
		case 'D':
			System.out.println("You must have scored 60.00 - 69.9");
			break;
		case 'F':
			System.out.println("You must have scored 0 - 59.9");
			break;
		}
		
		

	}

}
