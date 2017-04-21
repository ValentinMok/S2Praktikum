
public class Game {
	public static EntitySet game = new EntitySet();
//	State gameState;
//	public Game(State state){
//		this.gameState=state;
//		
//	}
Board board = new Board();
	

	public void run() {
		board.createEntitys2();
		while (true) {
			//UI.render1();
			render();
			processInput();
			update();
		}
	}

	public void render() {
		System.out.println(EntitySet.toString(Board.entitySet2));
	}

	public void processInput() {
		
		for (int i = 0; i <= Board.entitySet2.length - 1; i++) {
			if (Board.entitySet2[i] instanceof HandOperatedMasterSquirrel) {
				
				Board.entitySet2[i].nextStep();
			} 
				
		}
		
	}

	public void update() {
		int mastersq=0;
		for (int i = 0; i <= Board.entitySet2.length - 1; i++) {
			if (!(Board.entitySet2[i] instanceof HandOperatedMasterSquirrel)) {
				if (Board.entitySet2[i] != null)
					Board.entitySet2[i].nextStep();
				
		}else {
			mastersq=i;
		}
		
		
			//Board.possibleMoveSq(Board.entitySet2[mastersq].getXy(), Board.entitySet2[mastersq].getId());
	}
	}
}
