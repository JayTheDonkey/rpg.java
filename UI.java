import java.io.PrintStream;
import java.util.Scanner;
import java.util.ArrayList;

public class UI {
  public static PrintStream out = System.out;
  public static Scanner in = new Scanner(System.in);

  public static int menu(String question, ArrayList<String> menu){
    if(menu.size() <= 0) {
      return -1;
    }
    else if(menu.size() == 1) {
      return 0;
    }
    out.println(question);
    for(int i = 0; i < menu.size(); i++){
      out.println((i + 1) + ": " + menu.get(i));
    }
    int choice = in.nextInt();
    while(choice < 1 || choice > menu.size()) {
      out.println("please enter a valid number");
      choice = in.nextInt();
    }
    return choice - 1;
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
        out.println("1 " + names.get(j)[0]);
      }
      else {
        out.println(Integer.toString(number.get(j)) + " " + names.get(j)[1]);
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
}
