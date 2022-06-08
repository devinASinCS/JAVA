
public class HillClimber extends Climber {
	public HillClimber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HillClimber(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public void climbUpRight() {
		turnLeft();
		move();
		turnRight();
		move();
		move();
	}
	
	public void climbUpLeft() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
	}
	
	public void climbDownRight() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
	}
	
	public void climbDownLeft() {
		move();
		move();
		turnLeft();
		move();
		turnRight();
	}
}
