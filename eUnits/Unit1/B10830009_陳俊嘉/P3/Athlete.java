package P3;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Athlete extends Robot {

	public Athlete() {
		super(1,1,Display.NORTH,Display.INFINITY);
		// TODO Auto-generated constructor stub
	}

	public Athlete(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}
	
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public void putAndMove(int steps) {
		for (int step = 0; step < steps; ++step) {
			putBeeper();
			move();
		}	
	}
	
}
