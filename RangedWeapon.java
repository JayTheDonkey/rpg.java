public class RangedWeapon extends RangedAttack {
	// uses: 0 for infinite, positive number for number of times it can be used per combat
	public RangedWeapon(String tempName, String tempDescriptor, boolean tempPlural, int tempDice, int tempAdds, int tempMinStr, int tempMinDex, int tempUses, int tempPrice, boolean tempTwoHands) {
		super(tempName, tempDescriptor, tempPlural, tempDice, tempAdds, tempPrice, tempTwoHands);
		minStr = tempMinStr;
		minDex = tempMinDex;
		uses = tempUses;
		used = 0;
	}
	public int getMinStr() {
		return minStr;
	}
	public int getMinDex() {
		return minDex;
	}
	public void replenish() {
		used = 0;
	}
	public Damage damage(Creature c) {
		if(canUse(c) && uses > 0) {
			used++;
		}
		return super.damage(c);
	}
	public boolean canUse(Creature c) {
		return (c.getStrength() >= minStr && c.getDexterity() >= minDex && (used < uses || uses <= 0));
	}
 private int minDex, minStr;
 private int uses, used;
}