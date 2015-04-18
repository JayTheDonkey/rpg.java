import java.io.FileReader;
import java.io.FileWriter;

import java.util.Iterator;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.lang.reflect.Method;

public class Save {
  public static GameState read(String saveName) {
    JSONParser parser = new JSONParser();
    try {
      FileReader fileReader = new FileReader(saveName + ".json");
      JSONObject jsonGame = (JSONObject) parser.parse(fileReader);
      JSONObject jsonPlayer = (JSONObject) jsonGame.get("Player");

      JSONArray jsonAttacks;
      JSONArray jsonDefenses;
      Iterator i;

      ArrayList<MeleeWeapon> meleeWeapons = new ArrayList<MeleeWeapon>();
      jsonAttacks = (JSONArray) jsonPlayer.get("melee weapons");
      i = jsonAttacks.iterator();
      while(i.hasNext()) {
        JSONObject jsonAttack = (JSONObject) i.next();
        String stringAttack = utils.toCamelCase((String)jsonAttack.get("name"));

        try {
          Class cls = Class.forName("MakeMeleeWeapon");
          Method makeAtttack = cls.getDeclaredMethod(stringAttack, new Class[]{String.class});
          MakeMeleeWeapon makeMeleeWeapon = new MakeMeleeWeapon();
          meleeWeapons.add((MeleeWeapon)makeAtttack.invoke(makeMeleeWeapon, (String)jsonAttack.get("descriptor")));
        }
        catch(Exception ex){
          ex.printStackTrace();
        }
      }

      ArrayList<RangedWeapon> rangedWeapons = new ArrayList<RangedWeapon>();
      jsonAttacks = (JSONArray) jsonPlayer.get("ranged weapons");
      i = jsonAttacks.iterator();
      while(i.hasNext()) {
        JSONObject jsonAttack = (JSONObject) i.next();
        String stringAttack = utils.toCamelCase((String)jsonAttack.get("name"));

        try {
          Class cls = Class.forName("MakeRangedWeapon");
          Method makeAtttack = cls.getDeclaredMethod(stringAttack, new Class[]{String.class});
          MakeRangedWeapon makeRangedWeapon = new MakeRangedWeapon();
          rangedWeapons.add((RangedWeapon)makeAtttack.invoke(makeRangedWeapon, (String)jsonAttack.get("descriptor")));
        }
        catch(Exception ex){
          ex.printStackTrace();
        }
      }

    ArrayList<Spell> spells = new ArrayList<Spell>();
    jsonAttacks = (JSONArray) jsonPlayer.get("spells");
    i = jsonAttacks.iterator();
    while(i.hasNext()) {
      JSONObject jsonAttack = (JSONObject) i.next();
      String stringAttack = utils.toCamelCase((String)jsonAttack.get("name"));

      try {
        Class cls = Class.forName("MakeSpell");
        Method makeAtttack = cls.getDeclaredMethod(stringAttack, new Class[]{String.class});
        MakeSpell makeSpell = new MakeSpell();
        spells.add((Spell)makeAtttack.invoke(makeSpell, (String)jsonAttack.get("descriptor")));
      }
      catch(Exception ex){
        ex.printStackTrace();
      }
    }

    ArrayList<Armor> armor = new ArrayList<Armor>();
    jsonDefenses = (JSONArray) jsonPlayer.get("armor");
    i = jsonDefenses.iterator();
    while(i.hasNext()) {
      JSONObject jsonDefense = (JSONObject) i.next();
      String stringAttack = utils.toCamelCase((String)jsonDefense.get("name"));

      try {
        Class cls = Class.forName("MakeArmor");
        Method makeAtttack = cls.getDeclaredMethod(stringAttack, new Class[]{String.class});
        MakeArmor makeArmor = new MakeArmor();
        armor.add((Armor)makeAtttack.invoke(makeArmor, (String)jsonDefense.get("descriptor")));
      }
      catch(Exception ex){
        ex.printStackTrace();
      }
    }

    return new GameState((int)(long)jsonGame.get("node"), new Player((String)jsonPlayer.get("class"), (String)jsonPlayer.get("name"), meleeWeapons.toArray(new MeleeWeapon[meleeWeapons.size()]), rangedWeapons.toArray(new RangedWeapon[rangedWeapons.size()]), spells.toArray(new Spell[spells.size()]), armor.toArray(new Armor[armor.size()]), (int)(long)jsonPlayer.get("strength"), (int)(long)jsonPlayer.get("constitution"), (int)(long)jsonPlayer.get("dexterity"), (int)(long)jsonPlayer.get("speed"), (int)(long)jsonPlayer.get("intelligence"), (int)(long)jsonPlayer.get("wizardry"), (int)(long)jsonPlayer.get("luck"), (int)(long)jsonPlayer.get("charisma"), (int)(long)jsonPlayer.get("heal rate"), (int)(long)jsonPlayer.get("gp"), (int)(long)jsonPlayer.get("xp"), (int)(long)jsonPlayer.get("level")));
  }
  catch (Exception e) {
    e.printStackTrace();
  }
  return null;
}
  public static void write(String saveName, GameState state) {
    JSONObject gameState = new JSONObject();
    gameState.put("Save name", saveName);
    gameState.put("node", state.getNodeID());

    // for ease of use
    Player p = state.getPlayer();

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
      meleeWeapons.add(next);
    }
    player.put("melee weapons", meleeWeapons);

    JSONArray rangedWeapons = new JSONArray();
    for(int i = 0; i < p.getRangedWeapons().size(); i++) {
      RangedWeapon attack = p.getRangedWeapons().get(i);
      JSONObject next = new JSONObject();
      next.put("name", attack.getName());
      next.put("descriptor", attack.getDescriptor());
      rangedWeapons.add(next);
    }
    player.put("ranged weapons", rangedWeapons);

    JSONArray spells = new JSONArray();
    for(int i = 0; i < p.getSpells().size(); i++) {
      Spell attack = p.getSpells().get(i);
      JSONObject next = new JSONObject();
      next.put("name", attack.getName());
      next.put("descriptor", attack.getDescriptor());
      spells.add(next);
    }
    player.put("spells", spells);

    JSONArray armor = new JSONArray();
    for(int i = 0; i < p.getArmor().size(); i++) {
      Armor defense = p.getArmor().get(i);
      JSONObject next = new JSONObject();
      next.put("name", defense.getName());
      next.put("descriptor", defense.getDescriptor());
      armor.add(next);
    }
    player.put("armor", armor);

    gameState.put("Player", player);

    try {
      FileWriter jsonFileWriter = new FileWriter(saveName + ".json");
      jsonFileWriter.write(gameState.toJSONString());
      jsonFileWriter.flush();
      jsonFileWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
