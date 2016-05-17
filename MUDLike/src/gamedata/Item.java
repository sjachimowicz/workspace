package gamedata;

public class Item {
	private int attackRating;
	private int defenseRating;
	private String name;
	
	public Item(int attackRating, int defenseRating, String name){
		super();
		this.name = name;
		this.attackRating = attackRating;
		this.defenseRating = defenseRating;
	}
	public int getAttackRating() {
		return attackRating;
	}
	public void setAttackRating(int attackRating) {
		this.attackRating = attackRating;
	}
	public int getDefenseRating() {
		return defenseRating;
	}
	public void setDefenseRating(int defenseRating) {
		this.defenseRating = defenseRating;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

}
