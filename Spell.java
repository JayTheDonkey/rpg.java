public class Spell extends RangedAttack {
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
	public Damage damage(Creature c) {
		if(canUse(c)) {
			c.castSpell(wizCost);
		}
		Damage temp = super.damage(c);
		return new Damage(0, temp.getBlockable() + temp.getUnblockable());
	}
	public boolean canUse(Creature c) {
		return (c.getIntelligence() >= minInt && c.getWizardry() >= wizCost);
	}
 private int minInt, wizCost;
}