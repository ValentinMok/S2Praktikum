public class EntitySet {
	
	

	

//	public static void addEntity(Entity entity) {
//		int count = 0;
//		while (count <= EntitySet.entitySet.length - 1) {
//			if (EntitySet.entitySet[count] == null) {
//				EntitySet.entitySet[count] = entity;
//				break;
//			}
//			count++;
//		}
//	}

//	public void deleteEntity(int j) {
//		entitySet[j] = null;
//	}

	public static String toString(Entity[] entitySet) {
		String s = "";
		for (int i = 0; i <= entitySet.length - 1; i++) {
			if (entitySet[i] == null) {
			} else
				s = s + entitySet[i].toString() + "\n";
		}
		return s;
	}

//	public void possibleMoveSq(XY xy, int id) {
//		for (int i = 0; i <= entitySet.length - 1; i++) {
//			if (entitySet[i] != null) {
//				if (entitySet[i].getXy().equals(xy) && !(entitySet[i].equals(entitySet[findId(id)]))) {
//					entitySet[findId(id)].updateEnergy(entitySet[i].getEnergy());
//					
//					deleteEntity(i);
//					
//				}
//			}
//		}
//		
//	}

//	public boolean testWall(XY xy, int id) {
//		for (int i = 0; i <= entitySet.length - 1; i++) {
//			if (entitySet[i] != null) {
//				if (entitySet[i].getXy().equals(xy) && !(entitySet[i].equals(entitySet[findId(id)]))) {
//					if (entitySet[i] instanceof Wall) {
//						entitySet[findId(id)].updateEnergy(entitySet[i].getEnergy());
//						return false;
//					}
//					break;
//				}
//			}
//		}
//		return true;
//
//	}

	

//	public int findId(int id) {
//		for (int i = 0; i <= entitySet.length; i++) {
//			if (entitySet[i] != null)
//				if (entitySet[i].getId() == id)
//					return i;
//		}
//		return 0;
//	}

	public int getnextId() {
		return i++;
	}
}