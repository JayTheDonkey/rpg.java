import java.util.ArrayList;
public abstract class DecisionNode extends Node {
  public DecisionNode(ArrayList<Node> tempNextNodes) {
    nextNodes = tempNextNodes;
  }
  protected ArrayList<Node> nextNodes;
}