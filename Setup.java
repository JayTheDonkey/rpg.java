import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Setup {
  public static Player createPlayer() {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.nextLine();
    if (name.toLowerCase().equals("sir robin")) {
        utils.sleep(1000);
        System.out.println("What is your Quest?");
        utils.sleep(2000);
        System.out.println("To find the Holy Grail!");
        utils.sleep(2000);
        System.out.println("What...");
        utils.sleep(1000);
        System.out.print("is the capital of Assyria?");
        utils.sleep(1000);
        System.out.println("");
        System.out.println("I dont know that!");
        utils.sleep(100);
        System.out.println("AGGHHHHHHHHHHH");
        utils.sleep(1000);
        System.exit(0);
    }
    ArrayList<Integer> stats = new ArrayList<Integer>();
    for (int i = 0; i < 8; i++){
      stats.add(rollStat());
  }
  Collections.sort(stats);
  Collections.reverse(stats);
  int Strength = 0;
  int Constitution = 0;
  int Dexterity = 0;
  int Speed = 0;
  int Wizardry = 0;
  int Intelligence = 0;
  int Luck = 0;
  int Charisma = 0;
  int DefenseValue = 0;
  int HealRate = 0;
  ArrayList<RangedWeapon> RangedWeapons = new ArrayList<RangedWeapon>();
  ArrayList<MeleeWeapon> MeleeWeapons = new ArrayList<MeleeWeapon>();
  ArrayList<Spell> Spells = new ArrayList<Spell>();
  ArrayList<String> classes = new ArrayList<String>(Arrays.asList(new String[]{"Rogue", "Warrior", "Wizard", "Cleric"}));
  int classChoice = utils.menu("Choose your class", classes);
  switch(classChoice) {
      case 0:
      Dexterity = stats.remove(0);
      Strength = stats.remove(0);
      Intelligence = stats.remove(0);
      Luck = stats.remove(0);
      Collections.shuffle(stats);
      Charisma = stats.remove(0);
      Wizardry = stats.remove(0);
      Speed = stats.remove(0);
      Constitution = stats.remove(0);
      DefenseValue = 15;
      HealRate = 0;
      break;
      case 1:
      Strength = stats.remove(0);
      Dexterity = stats.remove(0);
      Constitution = stats.remove(0);
      Speed = stats.remove(0);
      Intelligence = stats.remove(stats.size()-1);
      Collections.shuffle(stats);
      Charisma = stats.remove(0);
      Wizardry = stats.remove(0);
      Luck = stats.remove(0);
      DefenseValue = 20;
      HealRate = 0;
      break;
      case 2:
      Wizardry = stats.remove(0);
      Intelligence = stats.remove(0);
      Luck = stats.remove(0);
      Collections.shuffle(stats);
      Constitution = stats.remove(0);
      Strength = stats.remove(0);
      Dexterity = stats.remove(0);
      Charisma = stats.remove(0);
      Speed = stats.remove(0);
      DefenseValue = 7;
      HealRate = 0;
      break;
      case 3:
      Constitution= stats.remove(0);
      Strength= stats.remove(0);
      Intelligence= stats.remove(0);
      Collections.shuffle(stats);
      Wizardry= stats.remove(0);
      Charisma= stats.remove(0);
      Luck= stats.remove(0);
      Speed= stats.remove(0);
      Dexterity= stats.remove(0);
      DefenseValue = 15;
      HealRate = 5;
      break;
  }
  System.out.println("your stats:");
  System.out.println("str:\t" + Strength);
  System.out.println("con:\t" + Constitution);
  System.out.println("dex:\t" + Dexterity);
  System.out.println("spd:\t" + Speed);
  System.out.println("wiz:\t" + Wizardry);
  System.out.println("int:\t" + Intelligence);
  System.out.println("lk:\t" + Luck);
  System.out.println("chr:\t" + Charisma);
  Player p = new Player(classes.get(classChoice), name, new MeleeWeapon[]{}, new RangedWeapon[]{}, new Spell[]{}, Strength, Constitution, Dexterity, Speed, Intelligence, Wizardry, Luck, Charisma, DefenseValue, HealRate, utils.random(300,700));

  ArrayList<MeleeWeapon> tempMelee = MakeMeleeWeapon.getAll();
  for(int i = 0; i < tempMelee.size(); i++) {
      if(tempMelee.get(i).canUse(p)) {
        MeleeWeapons.add(tempMelee.get(i));
    }
}
ArrayList<RangedWeapon> tempRanged = MakeRangedWeapon.getAll();
for(int i = 0; i < tempRanged.size(); i++) {
  if(tempRanged.get(i).canUse(p)) {
    RangedWeapons.add(tempRanged.get(i));
}
}
ArrayList<Spell> tempSpells = MakeSpell.getAll();
for(int i = 0; i < tempSpells.size(); i++) {
  if(tempSpells.get(i).canUse(p)) {
    Spells.add(tempSpells.get(i));
}
}

switch (classChoice) {
  case 0:
  utils.shop(p, MeleeWeapons, RangedWeapons, Spells);
  break;
  case 1:
  utils.shop(p, MeleeWeapons, RangedWeapons, new ArrayList<Spell>());
  break;
  case 2:
  utils.shop(p, new ArrayList<MeleeWeapon>(Arrays.asList(new MeleeWeapon[]{MakeMeleeWeapon.staff("sparkly")})), new ArrayList<RangedWeapon>(), Spells);
  break;
  case 3:
  utils.shop(p, MeleeWeapons, new ArrayList<RangedWeapon>(), Spells);
  break;
}

return p;
}
public static int rollStat() {
    int dice1, dice2, dice3;
    int total = 0;
    do {
      dice1 = utils.random(1,7);
      dice2 = utils.random(1,7);
      dice3 = utils.random(1,7);
      total += (dice1 + dice2 + dice3);
  }while (dice1 == dice2 && dice2 == dice3);
  return total;

}
}