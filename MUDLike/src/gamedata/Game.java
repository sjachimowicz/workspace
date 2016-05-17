package gamedata;

public class Game {

	public static void main(String[] args) {
		
		Item sword = new Item(2, 0, "Simple Sword");
		Item tunic = new Item(0, 2, "Leather Tunic");
		Hero steve = new Hero("Steve the Great", 100, 1, 5, 7, 0, sword, tunic);
		System.out.println(steve);
		steve.addRating(steve.getAttack(), sword);
		steve.addRating(steve.getDefense(), tunic);
		System.out.println(steve);
		
	
	

	}



}
