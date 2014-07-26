import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Save {
	public static void write(String saveName, int nodeID, Player p) {
		JSONObject gameState = new JSONObject();
		gameState.put("Save name", saveName);
		gameState.put("node", nodeID);

		JSONObject player = new JSONObject();
		player.put("name", p.toString());
		player.put("class", p.getClassName());
		player.put("heal rate", p.getHealRate());
		player.put("strength", p.getStrength());
		player.put("constitution", p.getConstitution());
		player.put("dexterity", p.getDexterity());
		player.put("speed", p.getSpeed());
		player.put("wizardry", p.getWizardry());
		player.put("intelligence", p.getIntelligence());
		player.put("luck", p.getLuck());
		player.put("charisma", p.getCharisma());
		player.put("gp", p.getGP());
		player.put("xp", p.getXP());
		player.put("level", p.getLevel());

		JSONArray meleeWeapons = new JSONArray();
		for(int i = 0; i < p.getMeleeWeapons().size(); i++) {
			MeleeWeapon attack = p.getMeleeWeapons().get(i);
			JSONObject next = new JSONObject();
			next.put("name", attack.getName());
			next.put("descriptor", attack.getDescriptor());
			next.put("plural", attack.isPlural());
			next.put("dice", attack.getDice());
			next.put("adds", attack.getAdds());
			next.put("min str", attack.getMinStr());
			next.put("min dex", attack.getMinDex());
			next.put("price", attack.getPrice());
			next.put("two hands", attack.isTwoHanded());
			meleeWeapons.add(next);
		}
		player.put("melee weapons", meleeWeapons);

		JSONArray rangedWeapons = new JSONArray();
		for(int i = 0; i < p.getRangedWeapons().size(); i++) {
			RangedWeapon attack = p.getRangedWeapons().get(i);
			JSONObject next = new JSONObject();
			next.put("name", attack.getName());
			next.put("descriptor", attack.getDescriptor());
			next.put("plural", attack.isPlural());
			next.put("dice", attack.getDice());
			next.put("adds", attack.getAdds());
			next.put("min str", attack.getMinStr());
			next.put("min dex", attack.getMinDex());
			next.put("uses", attack.getMaxUses());
			next.put("price", attack.getPrice());
			next.put("two hands", attack.isTwoHanded());
			rangedWeapons.add(next);
		}
		player.put("ranged weapons", rangedWeapons);

		JSONArray spells = new JSONArray();
		for(int i = 0; i < p.getSpells().size(); i++) {
			Spell attack = p.getSpells().get(i);
			JSONObject next = new JSONObject();
			next.put("name", attack.getName());
			next.put("descriptor", attack.getDescriptor());
			next.put("plural", attack.isPlural());
			next.put("dice", attack.getDice());
			next.put("adds", attack.getAdds());
			next.put("min int", attack.getMinInt());
			next.put("wiz cost", attack.getWizCost());
			next.put("price", attack.getPrice());
			next.put("two hands", attack.isTwoHanded());
			spells.add(next);
		}
		player.put("spells", spells);

		JSONArray armor = new JSONArray();
		for(int i = 0; i < p.getArmor().size(); i++) {
			Armor defense = p.getArmor().get(i);
			JSONObject next = new JSONObject();
			next.put("name", defense.getName());
			next.put("descriptor", defense.getDescriptor());
			next.put("min str", defense.getMinStr());
			next.put("min dex", defense.getMinDex());
			next.put("defense value", defense.getDefenseValue());
			next.put("price", defense.getPrice());
			next.put("dex debuff", defense.getDexDebuff());
			next.put("speed debuff", defense.getSpeedDebuff());
			next.put("magic resistance", defense.getMagicResistance());
			armor.add(next);
		}
		player.put("armor", armor);

		gameState.put("Player", player);

		try {
			FileWriter jsonFileWriter = new FileWriter(saveName + ".json");
			jsonFileWriter.write(gameState.toJSONString());
			jsonFileWriter.flush();
			jsonFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}