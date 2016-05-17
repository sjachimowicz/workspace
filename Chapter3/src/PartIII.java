import java.util.Scanner;

public class PartIII {
	// Part 3

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bucket, slotA, slotB, slotC;
		int counter = 0;

		System.out.println("Enter how many Quarters Marge has: ");
		bucket = input.nextInt();

		System.out.println("How many times has slot machine A been played? ");
		slotA = input.nextInt();

		System.out.println("How many times has slot machine B been played? ");
		slotB = input.nextInt();

		System.out.println("How many times has slot machine C been played? ");
		slotC = input.nextInt();

		while (bucket > 0) {
			if(bucket > 0){
				if (slotA == 35) {
					bucket--;
					bucket += 30;
					counter++;
					slotA = 0;

				} else {
					bucket--;
					slotA++;
					counter++;
				}
			}
			if (bucket > 0){
				if (slotB == 100) {
					bucket--;
					bucket += 70;
					counter++;
					slotB = 0;
				} else {
					bucket--;
					slotB++;
					counter++;
				}
				}
			if (bucket > 0){
				if (slotC == 10) {
					bucket--;
					bucket += 9;
					counter++;
					slotC = 0;

				} else {
					bucket--;
					slotC++;
					counter++;
				}
			}
		}
		System.out.println("Game Over! Marge played " + counter + " times");
	}
	}

