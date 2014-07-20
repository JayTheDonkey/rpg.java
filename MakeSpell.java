import java.util.Arrays;
import java.util.ArrayList;

public class MakeSpell {
	public static ArrayList<Spell> getAll(){
		return new ArrayList<Spell>(Arrays.asList(new Spell[]{frostBurn("magic"),magicMissile("magic"),fireball("magic"),ratSwarm("magic"),arcaneCannon("magic"),meteorStorm("magic"),thunderLance("magic")}));
	}
	public static Spell frostBurn(String descriptor) {
		return new Spell("frost burn", descriptor, false, 1, 3, 13, 1, 1);// find actual gold piece value
	}
	public static Spell magicMissile(String descriptor) {
		return new Spell("magic missile", descriptor, false, 2, 4, 14, 1, 1);// find actual gold piece value
	}
	public static Spell fireball(String descriptor) {
		return new Spell("fireball", descriptor, false, 3, 2, 16, 1, 1);// find actual gold piece value
	}
	public static Spell ratSwarm(String descriptor) {
		return new Spell("swarm of rats", descriptor, false, 4, 5, 18, 2, 1);// find actual gold piece value
	}
	public static Spell arcaneCannon(String descriptor) {
		return new Spell("arcane cannon", descriptor, false, 5, 3, 20, 2, 1);// find actual gold piece value
	}
	public static Spell meteorStorm(String descriptor) {
		return new Spell("meteor storm", descriptor, false, 6, 4, 25, 2, 1);// find actual gold piece value
	}
	public static Spell thunderLance(String descriptor) {
		return new Spell("thunder lance", descriptor, false, 7, 0, 27, 3, 1);// find actual gold piece value
	}
}