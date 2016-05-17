package gamedata;

public class Monster extends Character {

	private String weakness;
	private String resistance;
	
	public Monster(String name, int health, int level, int attack, int defense, String resistance, String weakness) {
		super(name, health, level, attack, defense);
		this.weakness = weakness;
		this.resistance = resistance;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public String getResistance() {
		return resistance;
	}

	public void setResistance(String resistance) {
		this.resistance = resistance;
	}
	
}
