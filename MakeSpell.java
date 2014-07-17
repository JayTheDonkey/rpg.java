public class MakeSpell {
	public static Spell frostBurn(String descriptor) {
		return new Spell("frost burn", descriptor, false, 1, 3, 13, 1);
	}
	public static Spell magicMissile(String descriptor) {
		return new Spell("magic missile", descriptor, false, 2, 4, 14, 1);
	}
	public static Spell fireball(String descriptor) {
		return new Spell("fireball", descriptor, false, 3, 2, 16, 1);
	}
	public static Spell ratSwarm(String descriptor) {
		return new Spell("swarm of rats", descriptor, false, 4, 5, 18, 2);
	}
	public static Spell arcaneCannon(String descriptor) {
		return new Spell("arcane cannon", descriptor, false, 5, 3, 20, 2);
	}
	public static Spell meteorStorm(String descriptor) {
		return new Spell("meteor storm", descriptor, false, 6, 4, 25, 2);
	}
	public static Spell thunderLance(String descriptor) {
		return new Spell("thunder lance", descriptor, false, 7, 0, 27, 3);
	}
}