package P2;

import edu.fcps.karel2.Robot;

public class BeepGetter extends Robot {
	public BeepGetter(int x, int y, int dir) {
		super(x, y, dir, 0);
	}

	public void faceWest() {
		while (!facingWest()) {
			turnLeft();
		}
	}

	public void findBeeper() {
		HorizontalGrabBeeper();
	}

	public void HorizontalGrabBeeper() {
		if (!frontIsClear()) {
			if (nextToABeeper()) {
				pickBeeper();
				turnLeft();
				turnLeft();
				return;
			}else {
				turnLeft();
				HorizontalGrabBeeper();
				turnLeft();
				turnLeft();
				turnLeft();
				return;
			}
		} else {
			move();
			HorizontalGrabBeeper();
			move();
		}
	}
}
