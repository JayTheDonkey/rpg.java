import java.util.Arrays;
import java.util.ArrayList;

public class PlayerDecisionNode extends DecisionNode {
  public PlayerDecisionNode(String[] tempMenu, Node[] tempNextNodes){
    super(tempNextNodes);
    menu = new ArrayList<String>(Arrays.asList(tempMenu));
  }

  public Node process(Player p) {
    return nextNodes.get(utils.menu("what would you like to do?", menu));
    }

  private ArrayList<String> menu;
}