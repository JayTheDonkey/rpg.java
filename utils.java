import java.util.ArrayList;

public class utils {
  public static void sleep(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static int random(int min, int max){
    return (int) (Math.random() * (max - min) + min);
  }

  public static String toCamelCase(String s){
    String[] parts = s.split(" ");
    String camelCaseString = "";
    for (String part : parts){
      camelCaseString += part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
    }
    return camelCaseString.substring(0, 1).toLowerCase() + camelCaseString.substring(1);
  }

  public static String monsterAdjective() {
    String[] adjectives = {"dirty", "rusty", "old", "average looking", "cursed", "mighty", "misshapen", "shiny", "funny looking", "bloody", "acid bitten", "scary looking", "blasphemous"};
    return adjectives[utils.random(0,adjectives.length)];
  }

  public static String playerAdjectives() {
    String[] adjectives = {"average looking", "epic", "ancient", "whispering", "bloodthirsty", "Legendary", "super duper", "mighty", "seal destroying", "bug murdering", "bugbear ending", "St. Geschwindigkeitsbegrenzung's, the patron saint of speed limits", "holy", "bad-ass", "LENGENDARALLY EPIC"};
    return adjectives[utils.random(0,adjectives.length)];
  }

  public static void shop(Player p, ArrayList<MeleeWeapon> meleeWeapons, ArrayList<RangedWeapon> rangedWeapons, ArrayList<Spell> spells, ArrayList<Armor> armor) {
    ArrayList<String> mainMenu = new ArrayList<String>();
    if(meleeWeapons.size() > 0) {
      mainMenu.add("Melee Weapons");
    }
    if(rangedWeapons.size() > 0) {
      mainMenu.add("Ranged Weapons");
    }
    if(spells.size() > 0) {
      mainMenu.add("Spells");
    }
    if (armor.size() > 0) {
      mainMenu.add("Armor");
    }
    mainMenu.add("Nothing, it's a scam!");
    int choice = -1;
    do {
      choice = UI.menu("What would you like to purchase with your " + Integer.toString(p.getGP()) + "GP?", mainMenu);
      if(mainMenu.get(choice).equals("Melee Weapons")) {
        ArrayList<String> attacks = new ArrayList<String>();
        for(int i = 0; i < meleeWeapons.size(); i++) {
          String next = meleeWeapons.get(i) + "\n\t" + Integer.toString(meleeWeapons.get(i).getPrice()) + "gp " + Integer.toString(meleeWeapons.get(i).getDice()) + "d6";
          if(meleeWeapons.get(i).getAdds() > 0) {
            next += " + " + Integer.toString(meleeWeapons.get(i).getAdds());
          }
          else if(meleeWeapons.get(i).getAdds() < 0) {
            next += " - " + Integer.toString(Math.abs(meleeWeapons.get(i).getAdds()));
          }
          if(meleeWeapons.get(i).isTwoHanded()) {
            next += " two-handed";
          }
          attacks.add(next);
        }
        attacks.add("nothing");
        int buying = UI.menu("what would you like to buy with your " + Integer.toString(p.getGP()) + "GP?", attacks);
        if(buying == meleeWeapons.size()) {
          UI.out.println("Fine! be like that!");
        }
        else if(meleeWeapons.get(buying).getPrice() <= p.getGP()) {
          p.getMeleeWeapons().add(meleeWeapons.get(buying));
          p.setGP(p.getGP() - meleeWeapons.get(buying).getPrice());
        }
        else {
          UI.out.println("Sorry, you don't have enough GP to buy that!");
        }
      }
      else if(mainMenu.get(choice).equals("Ranged Weapons")) {
        ArrayList<String> attacks = new ArrayList<String>();
        for(int i = 0; i < rangedWeapons.size(); i++) {
          String next = rangedWeapons.get(i) + "\n\t" + Integer.toString(rangedWeapons.get(i).getPrice()) + "gp " + Integer.toString(rangedWeapons.get(i).getDice()) + "d6";
          if(rangedWeapons.get(i).getAdds() > 0) {
            next += " + " + Integer.toString(rangedWeapons.get(i).getAdds());
          }
          else if(rangedWeapons.get(i).getAdds() < 0) {
            next += " - " + Integer.toString(Math.abs(rangedWeapons.get(i).getAdds()));
          }
          if(rangedWeapons.get(i).isTwoHanded()) {
            next += " two-handed";
          }
          attacks.add(next);
        }
        attacks.add("nothing");
        int buying = UI.menu("what would you like to buy with your " + Integer.toString(p.getGP()) + "GP?", attacks);
        if(buying == rangedWeapons.size()) {
          UI.out.println("Fine! be like that!");
        }
        else if(rangedWeapons.get(buying).getPrice() <= p.getGP()) {
          p.getRangedWeapons().add(rangedWeapons.get(buying));
          p.setGP(p.getGP() - rangedWeapons.get(buying).getPrice());
        }
        else {
          UI.out.println("Sorry, you don't have enough GP to buy that!");
        }
      }
      else if(mainMenu.get(choice).equals("Spells")) {
        ArrayList<String> attacks = new ArrayList<String>();
        for(int i = 0; i < spells.size(); i++) {
          String next = spells.get(i) + "\n\t" + Integer.toString(spells.get(i).getPrice()) + "gp " + Integer.toString(spells.get(i).getDice()) + "d6";
          if(spells.get(i).getAdds() > 0) {
            next += " + " + Integer.toString(spells.get(i).getAdds());
          }
          else if(spells.get(i).getAdds() < 0) {
            next += " - " + Integer.toString(Math.abs(spells.get(i).getAdds()));
          }
          if(spells.get(i).isTwoHanded()) {
            next += " two-handed";
          }
          attacks.add(next);
        }
        attacks.add("nothing");
        int buying = UI.menu("what would you like to buy with your " + Integer.toString(p.getGP()) + "GP?", attacks);
        if(buying == spells.size()) {
          UI.out.println("Fine! be like that!");
        }
        else if(spells.get(buying).getPrice() <= p.getGP()) {
          p.getSpells().add(spells.get(buying));
          p.setGP(p.getGP() - spells.get(buying).getPrice());
        }
        else {
          UI.out.println("Sorry, you don't have enough GP to buy that!");
        }
      }
      else if (mainMenu.get(choice).equals("Armor")){
        ArrayList<String> defense = new ArrayList<String>();
        for (int i = 0; i < armor.size(); i++){
          String next = armor.get(i) +"\n\t" + Integer.toString(armor.get(i).getPrice()) + "gp " + Integer.toString(armor.get(i).getDefenseValue()) + "defense points";
          if(armor.get(i).getSpeedDebuff() > 0) {
            next += " -" + Integer.toString(armor.get(i).getSpeedDebuff()) + " to dexterity";
          }
          if(armor.get(i).getSpeedDebuff() > 0) {
            next += " -" + Integer.toString(armor.get(i).getSpeedDebuff()) + " to speed";
          }
          defense.add(next);
        }
        defense.add("nothing");
        int buying = UI.menu("what would you like to buy with your " + Integer.toString(p.getGP()) + "GP?", defense);
        if(buying == armor.size()) {
          UI.out.println("Fine! be like that!");
        }
        else if(armor.get(buying).getPrice() <= p.getGP()) {
          p.getArmor().add(armor.get(buying));
          p.setGP(p.getGP() - armor.get(buying).getPrice());
        }
        else {
          UI.out.println("Sorry, you don't have enough GP to buy that!");
        }
      }
    } while(!mainMenu.get(choice).equals("Nothing, it's a scam!"));
  }
}
