
public class Date {

	private int month; // instance
	private int day;
	private int year;
	
	public Date(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}

	public int getMonth() {
		return month;

	}

	public void setMonth(int m) {
		if (m >= 1 && m <= 12) {
			month = m;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		year = y;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int d) {
		day = d;
	}
	public String toString(){
		String result;
		result = month + "/" + day + "/" + year;
		return result;
	}
}
