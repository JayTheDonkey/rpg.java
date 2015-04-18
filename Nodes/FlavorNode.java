class FlavorNode extends Node {
  public FlavorNode(String[] tempFlavorText, Node tempNext) {
    super();
    next = tempNext;
    flavorText = tempFlavorText;
  }
  public Node process(Player p) {
  	for(int i = 0; i < flavorText.length; i++) {
  		UI.out.println(flavorText[i]);
      if(flavorText.length > 1) {
        utils.sleep(1000);
      }
    }
    return next;
  }
  private String[] flavorText;
  private Node next;
}
