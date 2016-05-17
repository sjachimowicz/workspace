package assignment11;

public class Room {
	private double length;
	private double width;
	private String floorType;
	private int closetNumber;

	public Room(double length, double width, String floorType, int closetNumber) {
		setLength(length);
		setWidth(width);
		setFloorType(floorType);
		setClosetNumber(closetNumber);
	}

	public double findArea(double length, double width) {
		double result;
		result = length * width;
		return result;
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

	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public int getClosetNumber() {
		return closetNumber;
	}

	public void setClosetNumber(int closetNumber) {
		this.closetNumber = closetNumber;
	}

	public String toString() {
		return "The room is " + length + " in length, " + width + " in width. The floor type is: " + floorType
				+ " and has " + closetNumber + " closet(s)";
	}

}
