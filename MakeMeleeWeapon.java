public class MakeMeleeWeapon {
	public static MeleeWeapon sword(String descriptor) {
		return new MeleeWeapon("a " + descriptor + " sword", 3, 6);
  	}
  public static MeleeWeapon brassKnuckles(String descriptor) {
  	return new MeleeWeapon(descriptor + " brass knuckles", 1, 2);
  	}
  public static MeleeWeapon talons(String descriptor) {
  	return new MeleeWeapon(descriptor + " talons", 3, 6);
	  }
	public static MeleeWeapon axe(String descriptor) {
		return new MeleeWeapon("a " + descriptor + " axe", 3, 8);
	 	}
	public static MeleeWeapon stick(String descriptor) {
		return new MeleeWeapon("a " + descriptor + " stick", 2, 0);
		}
	public static MeleeWeapon staff(String descriptor) {
		return new MeleeWeapon("a " + descriptor + " staff", 2, 1);
		}
	}