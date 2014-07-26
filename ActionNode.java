public abstract class ActionNode extends Node {
  public ActionNode(Node tempNext) {
    super();
    next = tempNext;
    }

  public Node getNext() {
    return next;
    }

  private Node next;
  }