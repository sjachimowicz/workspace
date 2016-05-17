package gamedata;

public class Character {
	private int health;
	private String name;
	private int level;
	private int attack;
	private int defense;
	
	public Character(String name, int health, int level, int attack, int defense) {
		super();
		this.health = health;
		this.name = name;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String toString(){
		return "Name: " + name + "\nLevel: " + level + "\n Attack: " + attack + " Defense:  " + defense + "\nHit Points: " + health;
	}
}
