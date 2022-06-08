import edu.fcps.karel2.Display;

public class ButterflyDancer extends Dancer {
	public ButterflyDancer(int x) {
		super(x, 1, Display.NORTH, 0);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void danceStep() {
		// TODO Auto-generated method stub
		move();
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		turnLeft();
		move();
		turnLeft();
		move();
		turnLeft();
		
	}

}
