import java.util.Arrays;
import java.util.ArrayList;

public class MakeArmor {
	public static ArrayList<Armor> getAll() {
		return (new ArrayList<Armor>(Arrays.asList(new Armor[]{basicArmor("generic")})));
    }
    public static Armor basicArmor(String discriptor) {
 	    return new Armor("leather", discriptor, 5, 5, 10, 50, 1, 1, 0);
    }
}