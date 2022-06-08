package P2;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.WorldBackend;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openDefaultWorld();
		Display.setSize(10, 10);
		WorldBackend.getCurrent().putBeepers(1,1,1);
		Display.setSpeed(7);
		
		int dir = (int)(Math.random() * 4) + 1;
//		BeepGetter lisa = new BeepGetter(5, 1, dir);
		BeepGetter lisa = new BeepGetter(7, 5, dir);
		lisa.faceWest();
		lisa.findBeeper();
		lisa.putBeeper();
		
	}

}
