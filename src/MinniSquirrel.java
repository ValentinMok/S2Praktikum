public class MinniSquirrel extends Squirrel {
	private int parentId;

	public MinniSquirrel(int id, int energy, XY xy, int pid) {
		super(id, energy, xy);
		parentId = pid;
	}

	public String toString() {
		return this.getClass() + " mit ID: " + getId() + " Energy: " + getEnergy() + " Koordinaten " + getXy()
				+ " ParentID: " + parentId;
	}

	public int getPid() {
		return parentId;
	}
}