
public class MasterSquirrel extends Entity {
	
	public MasterSquirrel(int id,int x,int y,int energy) {
		super(id, energy, x, y);
	}
	

	public String toString() {
		return "MasterSquirrel mit ID: " + getId() + " Energy: " + getEnergy() + " Koordinaten x: " + getX() + " y: "
				+ getY();
	}
}
