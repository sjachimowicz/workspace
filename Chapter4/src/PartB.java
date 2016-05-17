//Part B
import java.util.Scanner;

public class PartB {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] uniqueArray = new int[5];
		int countValid = 0;
		int countUnique = 0;
		while (countValid < uniqueArray.length) {
			System.out.println("\n Enter a integer between 50 - 100: ");
			int myNumber = input.nextInt();

			if (isValid(myNumber)) {
				countValid++;
				if (isUnique(uniqueArray, myNumber)) {
					uniqueArray[countValid] = myNumber;
					countUnique++;
					System.out.println("Unique Numbers: " + countUnique);
					listUnique(uniqueArray);
				} else {
					System.out.println("That's not unique");
					System.out.println("Unique Numbers: " + countUnique);
					listUnique(uniqueArray);
				}
			} else {
				System.out.println("*INVALID NUMBER");
			}
		}
	}

	public static boolean isValid(int number) {
		boolean result = false;

		if (number >= 50 && number <= 100) {
			result = true;
		}
		return result;
	}

	public static boolean isUnique(int[] myArray, int number) {
		boolean result = true;
		for (int b = 0; b < myArray.length; b++) {
			if (number == myArray[b]) {
				result = false;
			}
		}

		return result;
	}

	public static void listUnique(int[] myArray) {
		for (int d = 0; d < myArray.length; d++)
			if (myArray[d] > 0) {
				System.out.print(myArray[d] + " ");
			}
	}

}
