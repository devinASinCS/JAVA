
//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Harvester extends Robot implements Workable {
	public Harvester(int x, int y) {
		super(x, y, Display.EAST, 0);
	}

	public Harvester() {
		super(2, 2, Display.EAST, 0);
	}

	public void workCorner() {
		// TODO Auto-generated method stub
		if (nextToABeeper()) {
			pickBeeper();
		}
		return;
	}

	@Override
	public void moveOneBlock() {
		// TODO Auto-generated method stub
		move();
		return;
	}

	@Override
	public void turnToTheRight() {
		// TODO Auto-generated method stub
		turnLeft();
		turnLeft();
		turnLeft();
		return;

	}

	@Override
	public void turnToTheNorth() {
		// TODO Auto-generated method stub
		while (!facingNorth()) {
			turnLeft();
		}
	}
}