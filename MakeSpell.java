public class MakeSpell {
	public static Spell frostBurn(String descriptor) {
		return new Spell(descriptor + " frost burn", 1, 3, 13, 1);
	}
	public static Spell magicMissile(String descriptor) {
		return new Spell("a " + descriptor + " magic missile", 2, 4, 14, 1);
	}
	public static Spell fireball(String descriptor) {
		return new Spell("a " + descriptor + " fireball", 3, 2, 16, 1);
	}
	public static Spell ratSwarm(String descriptor) {
		return new Spell("a " + descriptor + " swarm of rats", 4, 5, 18, 2);
	}
	public static Spell arcaneCannon(String descriptor) {
		return new Spell("a " + descriptor + " arcane cannon", 5, 3, 20, 2);
	}
	public static Spell meteorStorm(String descriptor) {
		return new Spell("a " + descriptor + " meteor storm", 6, 4, 25, 2);
	}
	public static Spell thunderLance(String descriptor) {
		return new Spell("a " + descriptor + " thunder lance", 7, 0, 27, 3);
	}
}