package Lab09;

import edu.fcps.Turtle;

public class TwistyTurtle extends Turtle {

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		for(int i = 5; i < 400; i += 10) {
			forward(i);
			turnLeft(123);
		}
	}

}
