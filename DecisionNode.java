import java.util.Arrays;
import java.util.ArrayList;

public abstract class DecisionNode extends Node {
  public DecisionNode(Node[] tempNextNodes) {
    super();
    nextNodes = new ArrayList<Node>(Arrays.asList(tempNextNodes));
  }
  protected ArrayList<Node> nextNodes;
}