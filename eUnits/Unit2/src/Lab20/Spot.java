package Lab20;

import java.awt.Color;
import java.awt.Graphics;

public class Spot {
	private int myX, myY, myRadius;
	private Color myColor;
	public Spot() {
		myX = 200;
		myY = 200;
		myRadius = 25;
		myColor = Color.RED;
	}
	
	public Spot(int x, int y, int r, Color c) {
		myX = x;
		myY = y;
		myRadius = r;
		myColor = c;
	}
	
	public int getX() {
		return myX;
	}
	
	public int getY() {
		return myY;
	}
	
	public int getRadius() {
		return myRadius;
	}
	
	public Color getColor() {
		return myColor;
	}
	
	public void setX(int x) {
		myX = x;
	}
	
	public void setY(int y) {
		myY = y;
	}
	
	public void setRadius(int r) {
		myRadius = r;
	}
	
	public void setColor(Color c) {
		myColor = c;
	}
	
	public void drawMe(Graphics g) {
		g.setColor(myColor);
		g.fillOval((int) (getX() - getRadius()), (int) (getY() - getRadius()), (int) (2 * getRadius()),
				(int) (2 * getRadius()));
	}
	
	public boolean intersect(Spot s) {
		return Math.sqrt((Math.pow((myX - s.getX()),2)) + (Math.pow((myY - s.getY()),2))) <= (myRadius + s.getRadius());
	}
	
}
