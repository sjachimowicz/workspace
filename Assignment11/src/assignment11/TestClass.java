package assignment11;

public class TestClass {

	public static void main(String[] args) {
		Room myRoom = new Room(10, 10, "Carpet", 1);
		System.out.println(myRoom);
		Garage myGarage = new Garage(1, 3, 2, 15, 25, "Dirt");
		Room[] myHouseRooms = new Room[5];
		myHouseRooms[0] = new Room(10, 10, "Carpet", 1);
		myHouseRooms[1] = new Room(15, 20, "Wood", 0);
		myHouseRooms[2] = new Room(12, 18, "Carpet", 2);
		myHouseRooms[3] = new Room(11, 13, "Tile", 0);
		myHouseRooms[4] = new Room(20, 8, "Wood", 0);

		House myHouse = new House(2, 6, 2, myHouseRooms);
		double houseAverage = myHouse.averageRoom(myHouseRooms);

		System.out.println(myGarage + "\n The garage's floorspace comes to: " + myGarage.floorSpace());
		System.out.println(myHouse + "\n The average size of the rooms in the house comes to: " + houseAverage
				+ "\n The total floorspace comes to: " + myHouse.floorSpace());

	}

}
