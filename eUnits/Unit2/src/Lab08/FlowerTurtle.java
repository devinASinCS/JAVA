//Name______________________________ Date_____________
package Lab08;

import edu.fcps.Turtle;
import java.awt.Color;

public class FlowerTurtle extends Turtle {
	private double mySize;
	private Color myColor;

	public FlowerTurtle() {
		mySize = 50.0;
		myColor = Color.RED;
	}

	public FlowerTurtle(double x, double n, Color c) {
		super(x, 300.0, 90.0);
		mySize = n;
		myColor = c;
	}

	public void setSize(double n) {
		mySize = n;
	}

	public void setColor(Color c) {
		myColor = c;
	}

	private void drawPetals() // starts and ends at center facing north
	{

		super.setColor(myColor);
		for(int i = 0; i < 30; ++i) {
			forward(mySize);
			turnLeft(180);
			forward(mySize);
			turnLeft(192);
		}

	}

	private void drawStem() // starts at top of stem facing south, ends at bottom
	{
		super.setColor(Color.GREEN);
		turnRight(180);
		forward(3.5 * mySize);
		turnLeft(180);
		forward(0.5 *mySize);
		turnLeft(45);
		forward(1.25 * mySize);
		turnLeft(180);
		forward(1.25 * mySize);
		turnLeft(90);
		forward(2.5 * mySize);
		turnLeft(180);
		forward(2.5 * mySize);
		

	}

	public void drawShape() {
		drawPetals();
		drawStem();
	}
}