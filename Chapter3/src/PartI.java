//Part 1.2
import java.util.Scanner;
public class PartI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
				int number;
				boolean isPrime = true;
				
				System.out.print("Enter an integer:");
				number = keyboard.nextInt();
				
				for( int factor = 2; factor < number; factor++){
					if( number % factor == 0){
						isPrime = false;
					}
				}
				if (isPrime){
					System.out.println(number + " is prime");
				}else{
					System.out.println(number + " is NOT prime");
				}
	

	}

}
