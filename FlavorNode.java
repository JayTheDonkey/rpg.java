class FlavorNode extends Node {
  public FlavorNode(String[] tempFlavorText, Node tempNext) {
    super();
    next = tempNext;
    flavorText = tempFlavorText;
    }
  public Node process(Player p) {
  	for(int i = 0; i < flavorText.length; i++) {
  		utils.print(flavorText[i]);
  		utils.sleep(1000);
  	  }
    return next;
    }
  private String[] flavorText;
  private Node next;
  }