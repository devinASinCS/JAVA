import edu.fcps.karel2.Display;

public class Dorothy extends Athlete {
	Dorothy() {
		super(2, 2, Display.EAST, 0);
	}

	public boolean findPath() {
		if(!nextToABeeper()) {
			turnAround();
			move();
			turnRight();
			move();
			if(nextToABeeper()) {
				return true;
			}else {
				turnAround();
				move();
				move();
				if(nextToABeeper()) {
					return true;
				}else {
					turnAround();
					move();
					turnRight();
					return false;
				}
			}
		}else if(!frontIsClear()){
			turnRight();
			move();
			if(nextToABeeper()) {
				return true;
			}else {
				turnAround();
				move();
				move();
				if(nextToABeeper()) {
					return true;
				}
			}
		}else {
			return true;
		}
		return false;
	}

	public void followPath() {
		move();
	}
}
