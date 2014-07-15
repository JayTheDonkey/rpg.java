public class MakeRangedWeapon {
	public static RangedWeapon rock(String descriptor) {
		return new RangedWeapon("a " + descriptor + " rock", 1, -2);
  	}
  public static RangedWeapon bow(String descriptor) {
  	return new RangedWeapon("a " + descriptor + " bow", 3, 6);
  	}
  public static RangedWeapon enchantedBow(String descriptor) {
  	return new RangedWeapon("a " + descriptor + " enchanted bow", 6, 6);
	  }
	public static RangedWeapon crossbow(String descriptor) {
  	return new RangedWeapon("a " + descriptor + " crossbow", 4, 2);
  	}
	public static RangedWeapon fireball(String descriptor) {
		return new RangedWeapon("a " + descriptor + " fireball", 5, 2);
	 	}
	public static RangedWeapon ratSwarm(String descriptor) {
		return new RangedWeapon("a " + descriptor + " swarm of rats", 8, -5);
		}
	}