
public class RaggedArray {

	public static void main(String[] args) {

		double[][] data;
		data = new double[4][];
		data[0] = new double[3];
		data[1] = new double[5];
		data[2] = new double[6];
		data[3] = new double[2];

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				data[row][col] = 88.7;
			}
		}
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(data[row][col] + " ");
			}
			System.out.println();
		}

		// int[][] allGrades;
		//
		// allGrades = new int[10][5];
		//
		// for (int row = 0; row < allGrades.length; row++) {
		// for (int col = 0; col < allGrades[row].length; col++) {
		// allGrades[row][col] = 88;
		// }
		// }
		// for (int row = 0; row < allGrades.length; row++) {
		// for (int col = 0; col < allGrades[row].length; col++) {
		// System.out.print(" " + allGrades[row][col]);
		// }
		// System.out.println();
		// }
	}
}
