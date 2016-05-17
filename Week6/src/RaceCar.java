

import java.util.Random;

public class RaceCar {
	private int speed;
	private String name;
	private int location = 0;
	
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	private static int maxSpeedForAll = 120;
	private static int minSpeedForAll = 0;
	
	public RaceCar(int speed, String name) {
		setSpeed(speed);
		setName(name);
	}
	public int randomSpeedChange(){
		Random random = new Random();
		int change;
		change = random.nextInt(21) - 10;
		speed = this.speed + change;
		return speed;
	}
	public void accelerate(int speed){
		this.speed = speed + 2;
	}
	public void decelerate(int speed){
		this.speed = speed - 2;
	}
	public int raceLocation(){
		this.location += this.speed;
		return this.location;
	}
	
	
	public static int getMaxSpeedForAll(){
		return maxSpeedForAll;
	}
	public static void setMaxSpeedForAll(int maxSpeedForAll){
		RaceCar.maxSpeedForAll = maxSpeedForAll;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if( speed <= minSpeedForAll){
			this.speed = minSpeedForAll;
		}
		if(speed <= maxSpeedForAll){
		this.speed = speed;
		}else{
			this.speed = maxSpeedForAll;
		}
	}
	public static int getMinSpeedForAll() {
		return minSpeedForAll;
	}

	public static void setMinSpeedforAll(int minSpeedForAll) {
		RaceCar.minSpeedForAll = minSpeedForAll;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return "RaceCar [name = " + name + ", speed= " + speed +"]";
	}
}
