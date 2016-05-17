import java.util.Random;

public class SlotMachine {
	private int payout;
	private int timesPlayed;
	private int payoutInterval;
	Random random = new Random();
	
	
		public SlotMachine(int payout, int timesPlayed, int payoutInterval) {
		super();
		this.payout = payout;
		this.timesPlayed = timesPlayed;
		this.payoutInterval = payoutInterval;
	}


		public int play(){
			int winnings;
			
			if(timesPlayed == payoutInterval){
				winnings = payout;
				timesPlayed = 0;
		} else{
			winnings = 0;
		}
			timesPlayed += 1;
			return winnings;
		}
		
	
		public int RandomPayout(){
			int randomPayout = random.nextInt(91) + 10;
			this.payout = randomPayout;
			return payout;
			}
		public int RandomTimesPlayed(){
			int randomTimesPlayed = random.nextInt(this.payout) - 1;
			this.timesPlayed = randomTimesPlayed;
			return this.timesPlayed;
		}
		public int RandomPayoutInterval(){
			int randomPayoutInterval = this.payout + random.nextInt(this.payout / 2);
			this.payoutInterval = randomPayoutInterval;
			return this.timesPlayed;
		}
		

		public int getPayout() {
			return payout;
		}


		public void setPayout(int payout) {
			this.payout = payout;
		}


		public int getTimesPlayed() {
			return timesPlayed;
		}


		public void setTimesPlayed(int timesPlayed) {
			this.timesPlayed = timesPlayed;
		}


		public int getPayoutInterval() {
			return payoutInterval;
		}


		public void setPayoutInterval(int payoutInterval) {
			this.payoutInterval = payoutInterval;
		}
}
