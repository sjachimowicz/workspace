package week1;

public class ReviewStuff {

	public static void main(String[] args) {
		
//		// beef stew is like food and drink
//	
//		byte bb;  // 1 byte signed -128 => 127 -2^7 => 2^7 - 1
//		short s; //  2                        
//		int i;   // 4                         
//		long myL;// 8                         -2^63 => 2^63 - 1
//		
//		float f;  // 4
//		double dd; // 8
//		
//		boolean bool; // 1 byte
//		char c; // 2 bytes
		
		// + - * / % Arithmetic
		// > < >= <= == != Relational
		// && & || | ! Logical ^ XOR
		// >> >>> << ~ & | Bitwise
		// System.out.println( 15 | 6);
		// ++ -- pre / post
		// += -= *= %= /= Combined assignment
		// unary + -
		// (type) (int) Cast
		// mix type expressions
		
		int a = 10, b = 6, c;
		double d = 1.6, d2;
		
		c = a / b;
		c = (int) 1.9;
		
		d2 = (double) a / b;
		
		System.out.println(d2);
		
		// byte and short
		
		byte b1 = 12, b2 = 5, b3;
		b3 = (byte) (b1 + b2);
		
		boolean result = 10 >= 13;
		System.out.println(result);
		
		// +=
		c = c + 10;
		c += 10;
		
		// b1 = b1 + b2;
		b1 += b2;			// b1 = (byte) (b1 + b2);
		
		//result = (boolean) 23;
//		a = 10;
//		result = false & ++a > 11;
//		System.out.println(result);
//		System.out.println(a);
//		
		
		result = ! ( 10 > 34) && true;
		System.out.println(result);
		
//		i= 56;
//		System.out.println(-i);

//		b = 127;
//		s = 32767; //largest literal short
//		i = 1234;
//		myL = 1234567891234567L;
//		
//		i = 017;
//		i= 0xA04;
//		i = 0b1001;
//		System.out.println(i);
//		
//		f = 2.5F;
//		d = 3.4;
//		
//		f = -1.5e-6f;
//		System.out.println(f);
//		
//		bool = true;
//		c = 'k';
//		
//		int $$$____asdf_____ASDF____34534;
//		
//		int myIntVariable;
//		
//		final int MY_CONSTANT = 345;
		
		

	}

}
