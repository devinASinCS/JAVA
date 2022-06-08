import edu.fcps.karel2.Display;

public class BackAndForthDancer extends Dancer {

	@Override
	public void danceStep() {
		// TODO Auto-generated method stub
		move();
		turnAround();
		move();
		turnAround();
	}

	public BackAndForthDancer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BackAndForthDancer(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
		// TODO Auto-generated constructor stub
	}
	
	public BackAndForthDancer(int x) {
		super(x, 1, Display.NORTH, 0);
		// TODO Auto-generated constructor stub
	}

}
