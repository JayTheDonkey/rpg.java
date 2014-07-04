public class RangedWeapon extends Weapon {
	public RangedWeapon(int tempDice, int tempAdds, int tempRange) {
		super(tempDice, tempAdds);
		range = tempRange;
		}

	public int getRange() {
		return range;
		}

	private int range;
	}