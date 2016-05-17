package week1;

public class Part3 {

	public static void main(String[] args) {

		int[][] table1 = { { 3, 2, 5 }, { 1, 9, 6 }, { 7, 8, 4 } };
		int[][] table2 = { { 3, 3, 5 }, { 1, 9, 6 }, { 3, 8, 4 } };
		int[][] table3 = { { 3, 2, 5 }, { 1, 9, 6 }, { 3, 8, 4 } };
		int[][] table4 = { { 3, 2, 1 }, { 10, 4, 6 }, { 5, 7, 8 } };
		int[][] table5 = { { 4, 1, 5 }, { 1, 9, 6 }, { 7, 8, 4 } };

		if (allIsPresent(table1)) {
			System.out.println("table1 contains all 9 numbers");
		} else {
			System.out.println("table1 does not contain all 9 numbers");
		}
		if (allIsPresent(table2)) {
			System.out.println("table2 contains all 9 numbers");
		} else {
			System.out.println("table2 does not contain all 9 numbers");
		}
		if (allIsPresent(table3)) {
			System.out.println("table3 contains all 9 numbers");
		} else {
			System.out.println("table3 does not contain all 9 numbers");
		}
		if (allIsPresent(table4)) {
			System.out.println("table4 contains all 9 numbers");
		} else {
			System.out.println("table4 does not contain all 9 numbers");
		}
		if (allIsPresent(table5)) {
			System.out.println("table5 contains all 9 numbers");
		} else {
			System.out.println("table5 does not contain all 9 numbers");
		}

	}

	public static boolean allIsPresent(int[][] array) {
		int counter = 0;


		for (int i = 1; i < 10; i++) {
			if (contains(i, array)) {
				counter++;
			}
		}

		if (counter == 9) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean contains(int a, int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (a == array[row][col]) {
					return true;
				}
			}
		}
		return false;
	}

}
