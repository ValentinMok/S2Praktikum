
public class BadPlant extends Entity {
	final static int energy = -100;

	public BadPlant(int id,int x, int y) {
		super(id, energy, x, y);
	}

	public String toString() {
		return "BadPlant mit ID: " + getId() + " Energy: " + getEnergy() + " Koordinaten x: " + getX() + " y: "
				+ getY();
	}
}
