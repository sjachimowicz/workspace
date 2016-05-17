
public class Part1Week6 {

	public static void main(String[] args) {
		Date birthday = new Date(11, 16, 1960);
		Date anniversary = new Date(3, 25, 1989);
		
		//birthday.month = 19;
		//birthday.day = 16;
		//birthday.year = 1960;
		
		birthday.setMonth(11);
		
		System.out.println(birthday);
	}
}

