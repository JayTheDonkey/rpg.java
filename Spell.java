public class Spell extends Attack {
	public Spell(String tempName, int tempDice, int tempAdds, int tempMinInt, int tempWizCost) {
		super(tempName, tempDice, tempAdds);
		minInt = tempMinInt;
		wizCost = tempWizCost;
	}
	public int getMinInt() {
		return minInt;
	}
	public int getWizCost() {
		return wizCost;
	}
	public boolean canUse(int intelligence, int wizardry) {
		return (intelligence >= minInt && wizardry >= wizCost);
	}
 private int minInt, wizCost;
}