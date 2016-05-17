package gamedata;

public class Hero extends Character {
	private Item armor;
	private Item weapon;
	private int experience;

	
	public Hero(String name, int health, int level, int attack, int defense,int experience, Item armor, Item weapon) {
		super(name, health, level, attack, defense);
		this.armor = armor;
		this.weapon = weapon;
		this.experience = experience;
	}
	
	public Item getArmor() {
		return armor;
	}


	public void setArmor(Item armor) {
		this.armor = armor;
	}
	
	public int getExperience(){
		return experience;
	}
	
	public void setExperience(int experience){
		this.experience = experience;
	}


	public Item getWeapon() {
		return weapon;
	}


	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}

	public String toString(){
		return super.toString() + "\nWeapon: " + weapon.getName() + "\nArmor: " + armor.getName() + "\nExp Points: " + experience;
	}
	
	public void addRating(int rating, Item item){
		int newRating = rating + item.getAttackRating() + item.getDefenseRating();
		if(item.getAttackRating() > item.getDefenseRating()){
			setAttack(newRating);
		}else{
			setDefense(newRating);
		}
		
		
	}
	public void equipWeapon(Item item){
		setWeapon(item);
	}
	public void equipArmor(Item item){
		setArmor(item);
	}
	public void levelUp(int experience){
		if(experience >= 100){
			int newLevel = 0;
			newLevel += 1;
			setLevel(1 + newLevel);
			setExperience(experience - 100);
		}
	}


}
