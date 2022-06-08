package Lab09;

import edu.fcps.Turtle;

public class TwistyTurtle3 extends Turtle {

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		for(int i = 25; i <= 150; i += 5) {
			for(int j = 0; j < 4; ++j) {
				forward(i);
				turnLeft(90);
			}
			turnLeft(45);
		}
	}

}
