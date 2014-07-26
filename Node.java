public abstract class Node {
	public Node() {
		count++;
		id = count;
	}
  public abstract Node getNext();

  public int getID() {
  	return id;
  }

  private static int count = 0;
  private int id;
}

