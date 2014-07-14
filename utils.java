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
  public static int menu(ArrayList<String> menu){
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < menu.size(); i++){
      System.out.print(i + 1);
      System.out.println(": "+ menu.get(i));
    }
    int choice = scan.nextInt();
      return choice;
  }
  public static int random(int min, int max){
    return (int) (Math.random() * (max - min) + min);
  }
  public static String print(String phrase){
    System.out.println(phrase);
    return phrase;
  }
  public static void printMonsters(ArrayList<Monster> monsters){
    ArrayList<String> monsterNames = new ArrayList<String>();
    for (int i = 0; i < monsters.size(); i++){
      monsterNames.add((monsters.get(i).toString()));
    }
    ArrayList<String> names = new ArrayList<String>();
       ArrayList<Integer> number = new ArrayList<Integer>();
       while(monsterNames.size() > 0) {
           String current = monsterNames.remove(0);
           boolean exists = false;
           for(int i = 0; i < names.size(); i++) {
               if(names.get(i).equals(current)) {
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
               System.out.println("1 " + names.get(j));
               }
           else {
               System.out.println(Integer.toString(number.get(j)) + " " + names.get(j) + "s");
               }
           }
       }
}