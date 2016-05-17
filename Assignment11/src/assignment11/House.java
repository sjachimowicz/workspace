package assignment11;

public class House extends Building {
	private int bathrooms;
	private Room[] rooms;

	public House(int floors, int windows, int bathrooms, Room[] rooms) {
		super(floors, windows);
		setRooms(rooms);
		setBathrooms(bathrooms);
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public double averageRoom(Room[] rooms) {
		double result;
		double sum = 0;
		for (int i = 0; i < rooms.length; i++) {
			sum += rooms[i].findArea(rooms[i].getLength(), rooms[i].getWidth());
		}
		result = sum / rooms.length;
		return result;
	}

	@Override
	public double floorSpace() {
		double result = 0.0;
		for (int i = 0; i < rooms.length; i++) {
			result += rooms[i].findArea(rooms[i].getLength(), rooms[i].getWidth());
		}
		return result;
	}

	public String toString() {
		return super.toString() + "\n This building is also house that contains: " + rooms.length + " rooms, "
				+ bathrooms + " bathrooms";
	}

}
