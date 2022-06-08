//Name______________________________ Date_____________
package Lab07;

import edu.fcps.Turtle;

public class PolygonTurtle extends Turtle {
	private double mySize;
	private int mySides;

	public PolygonTurtle() {
		super();
		mySize = 50.0;
		mySides = 6;
	}

	public PolygonTurtle(double n, int s) {
		mySize = n;
		mySides = s;
	}

	public PolygonTurtle(double x, double y, double h, double n, int s) {
		super(x, y, h);
		mySize = n;
		mySides = s;
	}

	public void setSize(double n) {
		mySize = n;
	}

	public void setSides(int s) {
		mySides = s;
	}

	public void drawShape() {

		for(int i = 0; i < mySides; ++i) {
			forward(mySize);
			turnLeft(180 - ((180 * (mySides - 2)) / mySides));
		}

	}
	
	public void drawShape(int s) {
		for(int i = 0; i < s; ++i) {
			forward(mySize);
			turnLeft(180 - ((180 * (s - 2)) / s));
		}
	}
	
	
	public void drawStar(int s) {
		System.out.print(360 - ((Math.abs(s - 6) * 180) / s));
		for(int i = 0; i < s; ++i) {
			forward(mySize);
			turnRight((180 - ((Math.abs(s - 6) * 180) / s)));
		}
	}
}