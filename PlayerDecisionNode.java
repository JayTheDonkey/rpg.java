import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDecisionNode extends DecisionNode {
  public PlayerDecisionNode(ArrayList<Node> tempNextNodes, ArrayList<String> tempMenu){
    super(tempNextNodes);
    menu = tempMenu;
  }
  
  public Node getNext() {
    int length = Math.min(nextNodes.size(), menu.size());
    for(int i = 0; i < length; i++) {
      System.out.print(i + 1);
      System.out.println(": " + menu.get(i));
      }
    int choice = scan.nextInt();
    return nextNodes.get(choice - 1);
    }
  
  private ArrayList<String> menu;
  Scanner scan = new Scanner(System.in);
}