import java.util.ArrayList;

public abstract class Creature {
	public Creature(ArrayList<Weapon> tempWeapons, int tempDefenseValue, int tempAgility, int tempHealRate = 0) {
		weapons = tempWeapons;
		defenseValue = tempDefenseValue;
		agility = tempAgility;
		healRate = tempHealRate;
		}

	public int dealDamage(int weaponNumber) {
		if(weaponNumber >= 0 && weaponNumber < weapons.size()) {
			return weapons.get(weaponNumber).damage();
			}
		return 0;
		}

	private ArrayList<Weapon> weapons;
	private int defenseValue;
	private int agility;
	private int healRate;
	private int health;
	}