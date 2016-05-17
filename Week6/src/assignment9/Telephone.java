package assignment9;

public class Telephone {
	private String areaCode;
	private String localNumber;

	public Telephone(int code, String number) {
		setAreaCode("" + code);
		setLocalNumber(number);
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}

	public String toString() {
		return areaCode + "-" + localNumber;
	}
}
