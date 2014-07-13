public abstract class ActionNode extends Node {
  public ActionNode(Node tempNext) {
    next = tempNext;
    }
  
  public Node getNext() {
    return next;
    }
  
  private Node next;
  }