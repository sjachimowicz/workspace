//Part A
public class partA {

	public static void main(String[] args) {
		// int grade1, grade, grade3;

		int[] grades;
		int size = 13;
		
		grades = new int[size];
		
		grades[0] = 99;
		grades[1] = grades[0] - 10;
		
		for(int i = 0; i < grades.length; i++){
			grades[i] = 100;
		}
		
		double[] data = new double[100];
		
		for(int i = 0; i < data.length; i++){
			data[i] = Math.random();
		}
		
		for(double d : data){
			System.out.println(d);
		}
		double result;
		result = findAverage(data);
		
		System.out.println("The average is: " + result);
		
		String[] names;
		
		names = new String[4];
		names[0] = "Bob";
		names[1] = new String("Colin");
		names[2] = "Jay";
		names[3] = "Wayne";
		
		for(String name : names){
			System.out.println(name);
		}
			

	} // end main
	
	static double findAverage(double [] array){
		double average = 0.0, sum = 0.0;
		
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		average = sum / array.length;
		
		return average;
	}

}
