public class MeleeWeapon extends Attack {
	public MeleeWeapon(String tempName, String tempDescriptor, boolean tempPlural, int tempDice, int tempAdds, int tempMinStr, int tempMinDex, int tempPrice) {
		super(tempName, tempDescriptor, tempPlural, tempDice, tempAdds, tempPrice);
		minStr = tempMinStr;
		minDex = tempMinDex;
	}
	public int getMinStr() {
		return minStr;
	}
	public int getMinDex() {
		return minDex;
	}
	public boolean canUse(Creature c) {
		return (c.getStrength() >= minStr && c.getDexterity() >= minDex);
	}
 private int minDex, minStr;
}