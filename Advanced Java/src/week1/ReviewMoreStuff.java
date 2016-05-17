package week1;

public class ReviewMoreStuff {

	public static void main(String[] args) {

		// selection: if else, switch, ? : conditional
		// repetition: while, do-while, for, enhanced for loop
		int a = 10, b = 6, c;

		int[] array = { 10, 20, 30, 40, 50 };

		for (int element : array) {

			System.out.println(element);
			// element = 27;
		}

		while (a > b) {
			System.out.println(b);
			b++;
		}

		do {
			System.out.println(b);
			b++;
		} while (a > b);

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		c = a > b ? 23 : a / b;

		System.out.println(a > b ? 5 : 34.78);

		if (a > b) {
			a = 10;
		} else {
			b = a / b;
			c = b + a;
		}

		switch ("Colin") {

		case "Bob":
			System.out.println("Bob");
			break;
		case "Colin":
			System.out.println("Colin");
			break;
		}

		switch (3) {

		case 0:
			System.out.println("it's a 0");
			break;
		case 1:
			System.out.println("it's a 1");
			break;
		default:
			System.out.println("not 0 or 1");
			break;
		}

	}

}
