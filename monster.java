import java.util.ArrayList;

public abstract class Monster extends Creature {
	public Monster(ArrayList<Weapon> tempWeapons, int tempDefenseValue, int tempAgility, int tempHealRate = 0) {
		super(tempWeapons, tempDefenseValue, tempAgility, tempHealRate);
		}
	}