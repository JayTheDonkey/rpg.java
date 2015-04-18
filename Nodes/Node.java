public abstract class Node {
	public Node() {
		count++;
		id = count;
    if(lastMade != null) {
      lastMade.setNextByID(this);
    }
    lastMade = this;
    if(first == null) {
      first = this;
    }
	}

  // returns the next node to go to
  public abstract Node process(Player p);

  public int getID() {
  	return id;
  }

  private void setNextByID(Node tempNextID) {
    nextID = tempNextID;
  }

  private Node getNextByID() {
    return nextID;
  }

  public static Node getNodeByID(int id) {
    Node returnValue = first;
    for(int i = 1; i < id; i++) {
      returnValue = returnValue.getNextByID();
    }
    return returnValue;
  }

  private static Node lastMade = null;
  private Node nextID;
  private static int count = 0;
  private int id;
  private static Node first = null;
}

