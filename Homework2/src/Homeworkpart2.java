
public class Homeworkpart2 {

	public static void main(String[] args) {
	int a = 2, b = 4, c = 11, result;
	double d1 = 3.4, d2 = 1.7, doubleResult;
	//1.
	result = a + c / b;
	System.out.println(result);
	//2
	result = (a + c)/ b;
	System.out.println(result);
	//3.
	result = (b * a) + c /a;
	System.out.println(result);
	//4.
	result = (int) d1 + (int) d2;
	System.out.println(result);
	//5.
	result = (int) (d1 + d2); 
	System.out.println(result); // (d1 + d2) = 5.1 int of 5.1 is 5
	//6.
	doubleResult = c / b + 6;
	System.out.println(doubleResult);
	//7.
	doubleResult = (double) c / b + a;
	System.out.println(doubleResult);
	//8
	doubleResult = d1 + d2 * a;
	System.out.println(doubleResult);
	//9
	doubleResult = (a + c) % a * d2;
	System.out.println(doubleResult);
	//10.
	doubleResult = a * -d2;
	System.out.println(doubleResult);
	

	}

}
