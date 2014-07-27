public class GameState {
	public GameState(int tempNodeID, Player tempP) {
		nodeID = tempNodeID;
		p = tempP;
	}
	public int getNodeID() {
		return nodeID;
	}
	public Player getPlayer() {
		return p;
	}
	private int nodeID;
	private Player p;
}