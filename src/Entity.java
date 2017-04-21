abstract class Entity {
	private int id;
	private int energy;
	private XY xy;

	public Entity(int id, int energy, XY xy) {
		this.id = id;
		this.energy = energy;
		this.xy = xy;
	}

	public int getId() {
		return id;
	}

	public int getEnergy() {
		return energy;
	}

	public XY getXy() {
		return xy;
	}

	public void setXy(XY newxy) {
		this.xy = newxy;
	}

	public void updateEnergy(int delta) {
		energy = energy + delta;
	}

	public void nextStep() {
		XY newxy = XY.move(xy);
		if (testWall(newxy, id)) {
			xy = newxy;
		}
	}

	public String toString() {
		return this.getClass() + " mit ID: " + getId() + " Energy: " + getEnergy() + " Koordinaten " + xy;
	}

	public MinniSquirrel createMinni(int i) {
		return null;
	}

	public boolean equals(Entity entity) {
		if (this.id == entity.getId()) {
			return true;
		}
		return false;
	}
	public void possibleMoveSq(XY xy, int id) {
		for (int i = 0; i <= Board.entitySet2.length - 1; i++) {
			if (Board.entitySet2[i] != null) {
				if (Board.entitySet2[i].getXy().equals(xy) && !(Board.entitySet2[i].equals(Board.entitySet2[findId(id)]))) {
					Board.entitySet2[findId(id)].updateEnergy(Board.entitySet2[i].getEnergy());
					
					deleteEntity(i);
					
				}
			}
		}
		
	}
	
	public int findId(int id) {
		for (int i = 0; i <= Board.entitySet2.length; i++) {
			if (Board.entitySet2[i] != null)
				if (Board.entitySet2[i].getId() == id)
					return i;
		}
		return 0;
	}
	
	public boolean testWall(XY xy, int id) {
		for (int i = 0; i <= Board.entitySet2.length - 1; i++) {
			if (Board.entitySet2[i] != null) {
				if (Board.entitySet2[i].getXy().equals(xy) && !(Board.entitySet2[i].equals(Board.entitySet2[findId(id)]))) {
					if (Board.entitySet2[i] instanceof Wall) {
						Board.entitySet2[findId(id)].updateEnergy(Board.entitySet2[i].getEnergy());
						return false;
					}
					break;
				}
			}
		}
		return true;

	}
	public void deleteEntity(int j) {
		Board.entitySet2[j] = null;
	}
}