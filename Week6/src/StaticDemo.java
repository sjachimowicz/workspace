
public class StaticDemo {

	public static void main(String[] args) {
		int raceLength = 1000;
		
		RaceCar andretti = new RaceCar(60,"Andretti");
		andretti.randomSpeedChange();
		
		
		
		//andretti.getMaxSpeedForAll(); should be using name of the class!
		
		while (andretti.getLocation() < raceLength){
		andretti.raceLocation();
		System.out.println(andretti.getLocation());
		}
			
//			System.out.println(andretti + "is in first place!");
			
		}
		

	}

//}
