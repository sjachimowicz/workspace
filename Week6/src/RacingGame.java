// Part 2 Array of Racers
public class RacingGame {

	public static void main(String[] args) {
		RaceCar[] cars = new RaceCar[10];
		cars[0] = new RaceCar( 30 , "Andretti");
		cars[1] = new RaceCar( 30 , "Johnson");
		cars[2] = new RaceCar( 30 , "Petty");
		cars[3] = new RaceCar( 30 , "Earlheart");
		cars[4] = new RaceCar( 30 , "Jachimoiwcz");
		cars[5] = new RaceCar( 30 , "Skywalker");
		cars[6] = new RaceCar( 30 , "Obama");
		cars[7] = new RaceCar( 30 , "Colbert");
		cars[8] = new RaceCar( 30 , "Fox");
		cars[9] = new RaceCar( 30 , "Smith");
		
		int raceLength = 1000;

		while (leadCar(cars).getLocation() < raceLength){
			for(int i = 0; i < cars.length ; i++){
				cars[i].randomSpeedChange();
				cars[i].raceLocation();
			}
			System.out.println( leadCar(cars).getName() + " is winning the race!" + " \n He is flying down the track at: " + leadCar(cars).getSpeed() + " mph!!");

	}
		System.out.println("The checkered flag is waving!" + leadCar(cars).getName() + " has finished the race in 1st place!!" );
		

}
	public static RaceCar leadCar(RaceCar[] cars){
		RaceCar leader = cars[0];
		
		for(int i = 1 ; i < cars.length; i++ ){
			if( leader.getLocation() < cars[i].getLocation()){
				leader = cars[i];
			}
		}
		return leader;
		
	}
}
