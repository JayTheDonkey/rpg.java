public class Damage {
	Damage(int tempBlockable, int tempUnblockable) {
		blockable = (tempBlockable > 0 ? tempBlockable : 0);
		unblockable = (tempUnblockable > 0 ? tempUnblockable : 0);
	}
	int getBlockable() {
		return blockable;
	}
	int getUnblockable() {
		return unblockable;
	}
	public String toString() {
		return Integer.toString(blockable + unblockable);
	}
	private int blockable, unblockable;
}