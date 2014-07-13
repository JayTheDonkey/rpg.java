class FlavorNode extends ActionNode {
  public FlavorNode(String tempFlavorText, Node tempNext) {
    super(tempNext);
    flavorText = tempFlavorText;
    }
  public String toString() {
    return flavorText;
    }
  private String flavorText;
  }