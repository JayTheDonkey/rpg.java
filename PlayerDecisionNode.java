import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDecisionNode extends DecisionNode {
  public PlayerDecisionNode(ArrayList<Node> tempNextNodes, ArrayList<String> tempMenu){
    super(tempNextNodes);
    menu = tempMenu;
  }
  
  public Node getNext() {
    return nextNodes.get(utils.menu(menu) - 1);
    }
  
  private ArrayList<String> menu;
  Scanner scan = new Scanner(System.in);
}