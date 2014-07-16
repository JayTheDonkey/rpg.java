public class MakeRangedWeapon {
	public static RangedWeapon lightCrossbow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " light crossbow", 3, -1, 8, 12, 20);
	}
	public static RangedWeapon crossbow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " crossbow", 4, 0, 12, 10, 20);
	}
	public static RangedWeapon heavyCrossbow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " heavy crossbow", 5, 0, 15, 10, 20);
	}
	public static RangedWeapon lightBow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " light bow", 4, 3, 15, 15, 20);
	}
	public static RangedWeapon bow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " bow", 5, 3, 20, 16, 20);
	}
	public static RangedWeapon heavyBow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " heavy bow", 6, 3, 25, 17, 20);
	}
	public static RangedWeapon enchantedBow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " enchanted bow", 6, 5, 15, 18, 20);
	}
	public static RangedWeapon sling(String descriptor) {
		return new RangedWeapon("a " + descriptor + " sling", 2, 0, 5, 10, 0);
	}
	public static RangedWeapon boomerang(String descriptor) {
		return new RangedWeapon("a " + descriptor + " boomerang", 2, 3, 11, 11, 0);
	}
	public static RangedWeapon trhowingAxe(String descriptor) {
		return new RangedWeapon("a " + descriptor + " throwing axe", 3, 2, 9, 12, 1);
	}
	public static RangedWeapon rock(String descriptor) {
		return new RangedWeapon("a " + descriptor + " rock", 1, 0, 0, 0, 0);
	}
}