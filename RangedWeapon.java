public class RangedWeapon extends RangedAttack {
	// uses: 0 for infinite, positive number for number of times it can be used per combat
	public RangedWeapon(String tempName, int tempDice, int tempAdds, int tempMinStr, int tempMinDex, int tempUses) {
		super(tempName, tempDice, tempAdds);
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
	public int damage(Creature c) {
		if(canUse(c)) {
			used++;
		}
		return super.damage(c);
	}
	public boolean canUse(Creature c) {
		return (c.getStrength() >= minStr && c.getDexterity() >= minDex && used < uses);
	}
 private int minDex, minStr;
 private int uses, used;
}