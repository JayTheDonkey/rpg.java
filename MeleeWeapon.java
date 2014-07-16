public class MeleeWeapon extends Attack {
	public MeleeWeapon(String tempName, int tempDice, int tempAdds, int tempMinStr, int tempMinDex) {
		super(tempName, tempDice, tempAdds);
		minStr = tempMinStr;
		minDex = tempMinDex;
	}
	public int getMinStr() {
		return minStr;
	}
	public int getMinDex() {
		return minDex;
	}
	public boolean canUse(int dex, int str) {
		return (str >= minStr && dex >= minDex);
	}
 private int minDex, minStr;
}