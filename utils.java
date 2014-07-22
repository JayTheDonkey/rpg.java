import java.util.Scanner;
import java.util.ArrayList;

public class utils {
  public static void sleep(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
  public static int menu(String question, ArrayList<String> menu){
    if(menu.size() <= 0) {
      return -1;
    }
    else if(menu.size() == 1) {
      return 0;
    }
    print(question);
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < menu.size(); i++){
      System.out.print(i + 1);
      System.out.println(": "+ menu.get(i));
    }
    int choice = scan.nextInt();
    while(choice < 1 || choice > menu.size()) {
      print("please enter a valid number");
      choice = scan.nextInt();
    }
    return choice - 1;
  }
  public static int random(int min, int max){
    return (int) (Math.random() * (max - min) + min);
  }
  public static String print(String phrase){
    System.out.println(phrase);
    return phrase;
  }
  public static String monsterAdjective() {
    String[] adjectives = {"dirty","rusty","old","average looking","cursed","mighty","misshapen","shiny","funny looking","bloody","acid bitten","scary looking","blasphemous",};
    return adjectives[utils.random(0,adjectives.length)];
  }
  public static String playerAdjectives() {
    String[] adjectives = {"average looking","epic","ancient","whispering","bloodthirsty","Legendary","super duper","mighty","seal destroying","bug murdering","bugbear ending","St. Geschwindigkeitsbegrenzung's, the patron saint of speed limits", "holy","bad-ass","LENGENDARALLY EPIC"};
    return adjectives[utils.random(0,adjectives.length)];
  }
  public static void printMonsters(ArrayList<Monster> monsters){
    ArrayList<String[]> monsterNames = new ArrayList<String[]>();
    for (int i = 0; i < monsters.size(); i++){
      monsterNames.add(new String[]{monsters.get(i).toString(), monsters.get(i).toPluralString()});
    }
    ArrayList<String[]> names = new ArrayList<String[]>();
    ArrayList<Integer> number = new ArrayList<Integer>();
    while(monsterNames.size() > 0) {
     String[] current = monsterNames.remove(0);
     boolean exists = false;
     for(int i = 0; i < names.size(); i++) {
       if(names.get(i)[0].equals(current[0])) {
         number.set(i, number.get(i) + 1);
         exists = true;
       }
     }
     if(!exists) {
       names.add(current);
       number.add(1);
     }
   }

   for(int j = 0; j < names.size(); j++) {
     if(number.get(j) == 1) {
       System.out.println("1 " + names.get(j)[0]);
     }
     else {
       System.out.println(Integer.toString(number.get(j)) + " " + names.get(j)[1]);
     }
   }
 }
 public static void printMonstersAndWeapons(ArrayList<Monster> monsters, ArrayList<Attack> weapons){
    ArrayList<String[]> monsterNames = new ArrayList<String[]>();
    ArrayList<String[]> weaponNames = new ArrayList<String[]>();
    for (int i = 0; i < monsters.size(); i++){
      monsterNames.add(new String[]{monsters.get(i).toString(), monsters.get(i).toPluralString()});
      weaponNames.add(new String[]{weapons.get(i).toString(), weapons.get(i).toPluralString()});
    }
    ArrayList<String[]> uniqueMonsters = new ArrayList<String[]>();
    ArrayList<String[]> uniqueWeapons = new ArrayList<String[]>();
    ArrayList<Integer> number = new ArrayList<Integer>();
    while(monsterNames.size() > 0) {
     String[] currentMonster = monsterNames.remove(0);
     String[] currentWeapon = weaponNames.remove(0);
     boolean exists = false;
     for(int i = 0; i < uniqueMonsters.size(); i++) {
       if(uniqueMonsters.get(i)[0].equals(currentMonster[0])) {
         number.set(i, number.get(i) + 1);
         exists = true;
       }
     }
     if(!exists) {
       uniqueMonsters.add(currentMonster);
       uniqueWeapons.add(currentWeapon);
       number.add(1);
     }
   }

   for(int j = 0; j < number.size(); j++) {
     if(number.get(j) == 1) {
       System.out.println("1 " + uniqueMonsters.get(j)[0] + " with a " + uniqueWeapons.get(j)[0]);
     }
     else {
       System.out.println(Integer.toString(number.get(j)) + " " + uniqueMonsters.get(j)[1] + " with " + uniqueWeapons.get(j)[1]);
     }
   }
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
  mainMenu.add("Nothing, it's a scam!");
  int choice = -1;
  do {
    choice = menu("What would you like to purchase with your " + Integer.toString(p.getGP()) + "GP?", mainMenu);
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
      int buying = menu("what would you like to buy with your " + Integer.toString(p.getGP()) + "GP?", attacks);
      if(buying == meleeWeapons.size()) {
        System.out.println("Fine! be like that!");
      }
      else if(meleeWeapons.get(buying).getPrice() <= p.getGP()) {
        p.getMeleeWeapons().add(meleeWeapons.get(buying));
        p.setGP(p.getGP() - meleeWeapons.get(buying).getPrice());
      }
      else {
        System.out.println("Sorry, you don't have enough GP to buy that!");
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
      int buying = menu("what would you like to buy with your " + Integer.toString(p.getGP()) + "GP?", attacks);
      if(buying == rangedWeapons.size()) {
        System.out.println("Fine! be like that!");
      }
      else if(rangedWeapons.get(buying).getPrice() <= p.getGP()) {
        p.getRangedWeapons().add(rangedWeapons.get(buying));
        p.setGP(p.getGP() - rangedWeapons.get(buying).getPrice());
      }
      else {
        System.out.println("Sorry, you don't have enough GP to buy that!");
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
      int buying = menu("what would you like to buy with your " + Integer.toString(p.getGP()) + "GP?", attacks);
      if(buying == spells.size()) {
        System.out.println("Fine! be like that!");
      }
      else if(spells.get(buying).getPrice() <= p.getGP()) {
        p.getSpells().add(spells.get(buying));
        p.setGP(p.getGP() - spells.get(buying).getPrice());
      }
      else {
        System.out.println("Sorry, you don't have enough GP to buy that!");
      }
    }
    else if (mainMenu.get(choice).equals("Armor")){
      System.out.println("There is currently no armor for sale");
    }
  } while(!mainMenu.get(choice).equals("Nothing, it's a scam!"));
 }
}