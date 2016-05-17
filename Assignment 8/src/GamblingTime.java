//Part 2

public class GamblingTime {

	public static void main(String[] args) {

		SlotMachine[] slots = new SlotMachine[50];
		int counter = 0;
		int money = 1000000;

		for (int i = 0; i < slots.length; i++) {
			slots[i] = new SlotMachine(0, 0, 0);
		}

		for (int i = 0; i < slots.length; i++) {
			slots[i].RandomPayout();
			slots[i].RandomPayoutInterval();
			slots[i].RandomTimesPlayed();
		}
		while (money > 0) {
			for (SlotMachine slot : slots) {
				if (money > 0) {
					money -= 1;
					money += slot.play();
					counter += 1;
				}
			}
		}
		System.out.println("The gambler played a total of " + counter + " times");

	}
}
