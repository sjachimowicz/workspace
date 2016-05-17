
//Part 1.4
import java.util.Random;

public class Rngtime {

	public static void main(String[] args) {
		Random generator = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(generator.nextInt(10));
		}

		int die1 = 0, die2 = 0, die3 = 0;
		
		for (int i = 0; i < 100000; i++){
			int die = generator.nextInt(6) + 1;
			if(die == 1){
				die1++;
			}else if(die == 2){
				die2++;
			}else if(die == 3){
				die3++;
			}
		}
		System.out.println("1:" + die1);
		System.out.println("2:" + die2);
		System.out.println("3:" + die3);

	}

}
