import java.util.Scanner;

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
  public static boolean choice(Scanner scan){
    String choice = scan.nextLine().toLowerCase();
    return (choice.equals("yes")||choice.equals("y"));
  }
}