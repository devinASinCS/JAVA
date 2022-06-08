import edu.fcps.karel2.Display;

public class Seeker extends Athlete {
	public Seeker(){
		super(1,1,Display.EAST,0);
	}
	
	public void fetchBeeper() {
		if(nextToABeeper()) {
			pickBeeper();
			turnAround();
			return;
		}else if(!frontIsClear()) {
			turnLeft();
			fetchBeeper();
			turnLeft();
			return;
		}else if(!rightIsClear()){
			move();
			fetchBeeper();
			move();
			return;
		}else {
			turnRight();
			move();
			turnRight();
			move();
			fetchBeeper();
			move();
			turnLeft();
			move();
			turnLeft();
			return;
		}
	}
}
