
public class Main {
	
	

	public static void main(String[] args) {
		MasterSquirrel masterSquirrel = new MasterSquirrel(0,0,0,1000);

		Entity[] entityset=EntitySet.entitySeet();
		System.out.println(masterSquirrel.energy);
			masterSquirrel.updateEnergy(10);
			EntitySet.deleteEntity(entityset[4],entityset);
			
			System.out.println(masterSquirrel.energy);
			masterSquirrel.updateEnergy(10);
			System.out.println(masterSquirrel.energy);
			
		}
	
}
