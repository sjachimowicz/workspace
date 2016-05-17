// Race 1 w/ Two Racers
public class Race {

	public static void main(String[] args) {

		RaceCar andretti = new RaceCar(30, "Andretti");
		RaceCar johnson = new RaceCar(30, "Johnson");
		 int locationA = 0;
		int locationJ = 0;
		
		while (isFinish(locationA, locationJ)){
			andretti.randomSpeedChange();
			johnson.randomSpeedChange();
			andretti.raceLocation();
			johnson.raceLocation();
			locationA = andretti.getLocation();
			locationJ = johnson.getLocation();

			if (andretti.getLocation() > johnson.getLocation()) {
				System.out.println("Andretti is currently leading the race! , He is currently at location "+ andretti.getLocation() + " ...While Johnson is trailing behind at location " + johnson.getLocation());
				andretti.decelerate(andretti.getSpeed());
				johnson.accelerate(johnson.getSpeed());
			} else {
				System.out.println("Johnson is currently leading the race! , He is at location " + johnson.getLocation() + " ...While Andretti is trailing behind at location " + andretti.getLocation());
				andretti.accelerate(andretti.getSpeed());
				johnson.decelerate(johnson.getSpeed());
			}
		}
		if (andretti.getLocation() > johnson.getLocation()) {
			System.out.println("Andretti has taken 1st place!!!");
		} else {
			System.out.println("Johnson has taken 1st place!!!");
		}
	}
	public static boolean isFinish(int locationA , int locationB){
		if(locationA < 1000){
			if(locationB < 1000){
				return true;
			}	
		}
		return false;
		
	}
}
