package assignment11;

public class Garage extends Building {
	private int parkingSpaces;
	private double length;
	private double width;
	private String floor;

	public Garage(int floors, int windows, int parkingSpaces, double length, double width, String floor) {
		super(floors, windows);
		setFloors(1);
		setParkingSpaces(parkingSpaces);
		setLength(length);
		setWidth(width);
		setFloor(floor);
	}

	public double floorSpace() {
		double result;
		result = length * width;
		return result;
	}

	public int getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(int parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		String gravel = "Gravel";
		this.floor = floor;
		if (this.floor.equals(gravel)) {
			this.floor = floor;
		} else {
			this.floor = "Concrete";
		}
	}

	public String toString() {
		return super.toString() + "\nThis building is a garage has space for: " + parkingSpaces + " cars - is " + length
				+ " by " + width + " in size and this garage has a : " + floor + " floor";
	}

}
