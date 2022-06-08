import edu.fcps.karel2.Display;

public class squareDancer extends Dancer {
	public squareDancer(int x) {
		super(x, 1, Display.NORTH, 0);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void danceStep() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; ++i) {
			move();
			move();
			turnLeft();
		}

	}

}
