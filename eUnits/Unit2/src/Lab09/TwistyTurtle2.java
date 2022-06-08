package Lab09;

import edu.fcps.Turtle;

public class TwistyTurtle2 extends Turtle {

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 150; i += 2) {
			forward(i);
			turnLeft(30);
		}
	}

}
