public class ComputerDecisionNode extends DecisionNode {
	public ComputerDecisionNode(Node[] tempNextNodes, Decision tempDecision) {
    super(tempNextNodes);
    decision = tempDecision;
  }

  public Node process(Player p) {
    return decision.run(p);
  }

  Decision decision;
}