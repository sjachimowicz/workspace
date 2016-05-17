package assignment11;

public abstract class Building {

	private int floors;
	private int windows;

	public Building(int floors, int windows) {
		setFloors(floors);
		setWindows(windows);
	}

	public abstract double floorSpace();

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public String toString() {
		return " This building has: " + floors + " floor(s) and: " + windows + " windows";
	}
}
