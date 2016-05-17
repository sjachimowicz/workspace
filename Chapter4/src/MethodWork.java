
public class MethodWork {

	public static void main(String[] args) {
		int cubeOfSeven;
		int seven = 7;

		outputMessages();
		cubeOfSeven = cube(seven);
		System.out.println(cubeOfSeven);

		int[] array = { 12, 23, 34, 56 };
		double average = findAverage(array);
		
		System.out.println("average: " + average);

	}

	public static double findAverage(int[] a) {
		double result;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		result = (double) sum / a.length;
		return result;
	}

	public static void outputMessages() {
		System.out.println("hello");
		System.out.println("from a method");
	}

	public static int cube(int parameter) {
		int result;

		result = parameter * parameter * parameter;
		return result;
	}

}
