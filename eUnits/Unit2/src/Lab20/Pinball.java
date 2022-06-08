package Lab20;

import java.awt.Color;

public class Pinball extends Spot {
	private int dx, dy;
	private int rightEdge, bottomEdge;

	public Pinball() {
		super(200, 200, 50, Color.BLACK);
		dx = (int) (Math.random() * 12 - 6); // to move vertically
		dy = (int) (Math.random() * 12 - 6);
	}

	public Pinball(int x, int y, int r, Color c) {
		super(x, y, r, c);
		dx = (int) (Math.random() * 12 - 6); // to move vertically
		dy = (int) (Math.random() * 12 - 6);
	}

	public int getdx() {
		return dx;
	}

	public int getdy() {
		return dy;
	}

	public int getRightEdge() {
		return rightEdge;
	}

	public int getBottomEdge() {
		return bottomEdge;
	}

	public void setdx(int x) {
		dx = x;
	}

	public void setdy(int y) {
		dy = y;
	}

	public void setBound(int x, int y) {
		rightEdge = x;
		bottomEdge = y;
	}

	public void tick() {
		setX(getX() + dx);
		if (getX() >= rightEdge - getRadius()) // hits the right edge
		{
			setX(rightEdge - getRadius());
			dx = (dx/Math.abs(dx)) * -1 * littleRandom();
		} else if (getX() <= getRadius()) {
			setX(getRadius());
			dx = (dx/Math.abs(dx)) * -1 * littleRandom();
		}

		setY(getY() + dy);
		if (getY() >= bottomEdge - getRadius()) // hits the right edge
		{
			setY(bottomEdge - getRadius());
			dy = (dy/Math.abs(dy)) * -1 * littleRandom();
		} else if (getY() <= getRadius()) {
			setY(getRadius());
			dy = (dy/Math.abs(dy)) * -1 * littleRandom();
		}
	}

	public int littleRandom() {
		return (int) (Math.random() * 6 + 1);
	}
}
