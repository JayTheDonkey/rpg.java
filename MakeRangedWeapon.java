public class MakeRangedWeapon {
	public static RangedWeapon frostBurn(String descriptor) {
		return new RangedWeapon(descriptor + " frost burn", 1, 3);
	 	}
	public static RangedWeapon magicMissile(String descriptor) {
		return new RangedWeapon("a " + descriptor + " magic missile", 2, 4);
	 	}
	public static RangedWeapon fireball(String descriptor) {
		return new RangedWeapon("a " + descriptor + " fireball", 3, 2);
	 	}
	public static RangedWeapon ratSwarm(String descriptor) {
		return new RangedWeapon("a " + descriptor + " swarm of rats", 4, 5);
		}
	public static RangedWeapon arcaneCannon(String descriptor) {
		return new RangedWeapon("a " + descriptor + " arcane cannon", 5, 3);
	 	}
	public static RangedWeapon meteorStorm(String descriptor) {
		return new RangedWeapon("a " + descriptor + " meteor storm", 6, 4);
	 	}
	public static RangedWeapon thunderLance(String descriptor) {
		return new RangedWeapon("a " + descriptor + " thunder lance", 7, 0);
	 	}
	public static RangedWeapon lightCrossbow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " light crossbow", 3, -1);
		}
	public static RangedWeapon crossbow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " crossbow", 4, 0);
		}
	public static RangedWeapon heavyCrossbow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " heavy crossbow", 5, 0);
		}
	public static RangedWeapon lightBow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " light bow", 4, 3);
		}
	public static RangedWeapon bow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " bow", 5, 3);
		}
	public static RangedWeapon heavyBow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " heavy bow", 6, 3);
		}
	public static RangedWeapon enchantedBow(String descriptor) {
		return new RangedWeapon("a " + descriptor + " enchanted bow", 6, 5);
		}
	public static RangedWeapon sling(String descriptor) {
		return new RangedWeapon("a " + descriptor + " sling", 2, 0);
		}
	public static RangedWeapon boomerang(String descriptor) {
		return new RangedWeapon("a " + descriptor + " boomerang", 2, 3);
		}
	public static RangedWeapon trhowingAxe(String descriptor) {
		return new RangedWeapon("a " + descriptor + " trhowing axe", 3, 2);
		}
	public static RangedWeapon rock(String descriptor) {
		return new RangedWeapon("a " + descriptor + " rock", 1, 0);
		}
	}