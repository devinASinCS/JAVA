package P2;

import edu.fcps.Turtle;

public class StarTurtle extends Turtle {
	private double size = 180;
	public StarTurtle() {
		super();
	}
	
	public StarTurtle(double x, double y) {
		super(x, y, 90);
	}
	
	public void setSize(double n) {
		size = n;
	}
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		for(int j = 0; j < 20; j++) {
		forward(size/2);
		turnLeft(165);
		for(int i = 0; i < 12; ++i) {
			forward(size);
			turnLeft(150);
		}
		turnLeft(15);
		forward(size/2);
		turnLeft(180);
		size -= 10;
		}
	}

}
