import java.util.Scanner;

public class HandOperatedMasterSquirrel extends MasterSquirrel {
	public static XY xy = new XY(0, 3);

	public HandOperatedMasterSquirrel(int id) {
		super(id, xy);
	}

	public void nextStep() {
		System.out.println("'w','a','s','d'oder'n' eingeben.");
		@SuppressWarnings("resource")
		Scanner step = new Scanner(System.in);
		char d = step.next(".").charAt(0);
		if (d == 'w' | d == 'a' | d == 's' | d == 'd') {
			doMove(d);
		} else if (d == 'n') {
			System.out.println("Bitte Wert zwischen 100 und " + (this.getEnergy() - 1) + " eingeben");
			@SuppressWarnings("resource")
			Scanner enScan = new Scanner(System.in);
			int givenEnergy = Integer.parseInt(enScan.nextLine());
			while (givenEnergy >= this.getEnergy() | givenEnergy < 100) {
				System.out.println("Zahl nicht zulssig nochmal versuchen");
				@SuppressWarnings("resource")
				Scanner enScan2 = new Scanner(System.in);
				givenEnergy = Integer.parseInt(enScan2.nextLine());
			}
			Board.addEntity1(this.createMinni(givenEnergy));
		} else {
			System.out.println("keine gltige Eingabe");
		}
	}

	public void doMove(char dir) {
		XY vector = new XY(0, 0);
		switch (dir) {
		case 'w':
			vector = new XY(0, -1);
			break;
		case 'a':
			vector = new XY(-1, 0);
			break;
		case 's':
			vector = new XY(0, 1);
			break;
		case 'd':
			vector = new XY(1, 0);
			break;
		default:
			System.out.println("keine gltige Richtung");
		}
		XY newxy = XY.addXy(getXy(), vector);
		boolean move = testWall(newxy, getId());
		if (move) {
			setXy(newxy);
		}
	}
}