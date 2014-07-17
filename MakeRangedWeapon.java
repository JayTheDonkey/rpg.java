public class MakeRangedWeapon {
	public static RangedWeapon lightCrossbow(String descriptor) {
		return new RangedWeapon("light crossbow", descriptor, false, 3, -1, 8, 12, 20);
	}
	public static RangedWeapon crossbow(String descriptor) {
		return new RangedWeapon("crossbow", descriptor, false, 4, 0, 12, 10, 20);
	}
	public static RangedWeapon heavyCrossbow(String descriptor) {
		return new RangedWeapon("heavy crossbow", descriptor, false, 5, 0, 15, 10, 20);
	}
	public static RangedWeapon lightBow(String descriptor) {
		return new RangedWeapon("light bow", descriptor, false, 4, 3, 15, 15, 20);
	}
	public static RangedWeapon bow(String descriptor) {
		return new RangedWeapon("bow", descriptor, false, 5, 3, 20, 16, 20);
	}
	public static RangedWeapon heavyBow(String descriptor) {
		return new RangedWeapon("heavy bow", descriptor, false, 6, 3, 25, 17, 20);
	}
	public static RangedWeapon enchantedBow(String descriptor) {
		return new RangedWeapon("enchanted bow", descriptor, false, 6, 5, 15, 18, 20);
	}
	public static RangedWeapon sling(String descriptor) {
		return new RangedWeapon("sling", descriptor, false, 2, 0, 5, 10, 0);
	}
	public static RangedWeapon boomerang(String descriptor) {
		return new RangedWeapon("boomerang", descriptor, false, 2, 3, 11, 11, 0);
	}
	public static RangedWeapon throwingAxe(String descriptor) {
		return new RangedWeapon("throwing axe", descriptor, false, 3, 2, 9, 12, 1);
	}
	public static RangedWeapon rock(String descriptor) {
		return new RangedWeapon("rock", descriptor, false, 1, 0, 0, 0, 0);
	}
}