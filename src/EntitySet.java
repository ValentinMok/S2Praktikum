
public class EntitySet {
	public static Entity[] entitySeet(){
	Entity[] entitySet = new Entity[11];
	int i=1;
	GoodBeast gb1 = new GoodBeast(i,0, 1);
	addEntity(gb1,entitySet);
	i++;
	GoodBeast gb2 = new GoodBeast(i,4, 4);
	addEntity(gb2,entitySet);
	i++;
	BadBeast bb1 = new BadBeast(i,3, 3);
	addEntity(bb1,entitySet);
	i++;
	BadBeast bb2 = new BadBeast(i,2, 2);
	addEntity(bb2,entitySet);
	i++;
	GoodPlant gp1 = new GoodPlant(i,1, 0);
	addEntity(gp1,entitySet);
	i++;
	GoodPlant gp2 = new GoodPlant(i,4, 6);
	addEntity(gp2,entitySet);
	i++;
	BadPlant bp1 = new BadPlant(i,6, 6);
	addEntity(bp1,entitySet);
	i++;
	BadPlant bp2 = new BadPlant(i,9, 9);
	addEntity(bp2,entitySet);
	i++;
	Wall w1 = new Wall(i,7, 7);
	addEntity(w1,entitySet);
	i++;
	Wall w2 = new Wall(i,8, 8);
	addEntity(w2,entitySet);
	i++;
	System.out.println(toString(entitySet));
	return entitySet;
	}
	
	public static void addEntity(Entity entity,Entity[] entitySet) {
		int count = 0;
		while (count <= entitySet.length - 1) {
			if (entitySet[count] == null) {
				entitySet[count] = entity;
				break;
			}
			count++;
		}

	}

	public static void deleteEntity(Entity test,Entity[] entitySet) {
		for (int i = 0; i <= entitySet.length - 1; i++) {
			if (entitySet[i] == test) {
				entitySet[i] = null;
			}
		}
	}
	public static String toString(Entity[] entitySet) {
		String s = "";
		for (int i = 0; i <= entitySet.length - 1; i++) {
			if (entitySet[i] == null) {

			} else
				s = s + entitySet[i].toString() + "\n";
		}

		return s;
	}

}
