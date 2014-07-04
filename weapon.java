public class Weapon {
	public Weapon(int tempDice, int tempAdds) {
		dice = tempDice;
		adds = tempAdds;
		}

	public int damage() {
		int diceTotal = 0;
		for(int i = 0; i < dice; i++) {
			diceTotal += Utils.random(1, 6);
			}
		return diceTotal + adds;
		}

	private int dice;
	private int adds;
}