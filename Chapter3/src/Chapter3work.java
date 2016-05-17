import java.util.Scanner;

public class Chapter3work {

	public static void main(String[] args) {
////		//Part II A
//		int count = 1;
//		
//		while (count <= 25){
//			System.out.print(count);
//			count++;
//		}
//		
//		//Part II B
//		int countB = 0;
//		
//		while (countB <= 125){
//			System.out.println(countB);
//			countB += 7;
//		}
//		//Part II C
//		int sum = 0;
//		
//		for( int i = 234; i <= 19348; i++ ){
//			sum += i;
//		}
//		System.out.println("The sum is "+ sum);
//		
//		//Part II D
//		Scanner input = new Scanner(System.in);
//		int number , sum = 0;
//		
//		System.out.print("Please enter an integer (-999 to quit):");
//		number = input.nextInt();
//		
//		while(number != -999){
//			sum += number;
//			
//			System.out.print("Please enter an integer (-999 to quit):");
//			number = input.nextInt();
//			
//		}
//		System.out.println("The total is " + sum);
//		//Part II E
//		
		int number = 1;
		int counter = 0;
		
		while( number >= 0){
			System.out.println(number);
			number *= 2;
			counter++;
		}
		System.out.println("The loop ran " + counter + " times");

		
		
		
	}

}
