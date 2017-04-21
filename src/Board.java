
public class Board {
	BoardConfig bc = new BoardConfig();
	private int k = 0;
	public static Entity[] entitySet2 = new Entity[70];
	public void createEntitys2(){
		addEntity1(new HandOperatedMasterSquirrel(k++));
		randomEntity();
		Walls();
	}
	public void Walls() {

		for (int i = 0; i <= bc.wallbreite; i++) {
			System.out.println("");
			for (int j = 0; j <= bc.wallbreite; j++) {

				if (i == 0 || i == bc.wallbreite || j == 0 || j == bc.wallbreite) {
					addEntity1(new Wall(k++, new XY(i, j)));
					System.out.print("X ");
				} else {
					System.out.print("  ");
				}
			}
		}
		System.out.println();
		System.out.println();
	}

	public void randomEntity() {

		
		for (int i = 0; i <= bc.entityanzahl - 1; i++) {
			addEntity1(new GoodBeast(k++, new XY(randomint(), randomint())));
			addEntity1(new BadBeast(k++, new XY(randomint(), randomint())));
			addEntity1(new GoodPlant(k++, new XY(randomint(), randomint())));
			addEntity1(new BadPlant(k++, new XY(randomint(), randomint())));
		}
	}

	private int randomint() {
		int range = (bc.wallbreite - 2) + 1;
		return (int) (Math.random() * range) + 1;
	}

	public static void addEntity1(Entity entity) {
		int count = 0;
		while (count <= entitySet2.length - 1) {
			if (entitySet2[count] == null) {
				entitySet2[count] = entity;
				break;
			}
			count++;
		}
	}

	public Entity[][] flatten() {
		Entity[][] GameBoard = new Entity[bc.wallbreite][bc.wallbreite];
		for (int i = 0; i <= entitySet2.length; i++) {
			if (entitySet2[i] != null) {
				int x = entitySet2[i].getXy().x;
				int y = entitySet2[i].getXy().y;
				GameBoard[x][y] = entitySet2[i];
			}
		}
		return GameBoard;
	}
//	public void deleteEntity(int j) {
//		entitySet2[j] = null;
//	}
	
//	public void possibleMoveSq(XY xy, int id) {
//		for (int i = 0; i <= entitySet2.length - 1; i++) {
//			if (entitySet2[i] != null) {
//				if (entitySet2[i].getXy().equals(xy) && !(entitySet2[i].equals(entitySet2[findId(id)]))) {
//					entitySet2[findId(id)].updateEnergy(entitySet2[i].getEnergy());
//					
//					deleteEntity(i);
//					
//				}
//			}
//		}
//		
//	}
//	
//	public int findId(int id) {
//		for (int i = 0; i <= entitySet2.length; i++) {
//			if (entitySet2[i] != null)
//				if (entitySet2[i].getId() == id)
//					return i;
//		}
//		return 0;
//	}
//	
//	public boolean testWall(XY xy, int id) {
//		for (int i = 0; i <= entitySet2.length - 1; i++) {
//			if (entitySet2[i] != null) {
//				if (entitySet2[i].getXy().equals(xy) && !(entitySet2[i].equals(entitySet2[findId(id)]))) {
//					if (entitySet2[i] instanceof Wall) {
//						entitySet2[findId(id)].updateEnergy(entitySet2[i].getEnergy());
//						return false;
//					}
//					break;
//				}
//			}
//		}
//		return true;
//
//	}
}
