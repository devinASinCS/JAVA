package StarWars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class spaceshipbullets extends JPanel {

	private int myX; // x and y coordinates of center
	private int myY;
	private int mywidth; // x and y coordinates of center
	private int myheight;
	private int step = 10;

	public spaceshipbullets() {
		myX = 10;
		myY = 10;
		mywidth = 60;
		myheight = 70;
	}

	public spaceshipbullets(int x, int y, int w, int h) {
		myX = x;
		myY = y;
		mywidth = w;
		myheight = h;
	}

	public int getX() {
		return myX;
	}

	public int getY() {
		return myY;
	}

	public int getwidth() {
		return mywidth;
	}

	public int getheight() {
		return myheight;
	}

	public void setX(int x) {
		myX = x;
	}

	public void setY(int y) {
		myY = y;
	}

	public void setwidth(int w) {
		mywidth = w;
	}

	public void setheight(int h) {
		myheight = h;
	}

	public void move(int xPos, int yPos, int front) {
		if(myY > front ) {
			myY = myY - step;
		}
		else if(myY <= front) {
			myY = yPos;
			setX(xPos);
			setY(yPos);
		}
	}

	public void draw(Graphics g) {
		ImageIcon enemy = new ImageIcon(spaceshipbullets.class.getResource("mybullet.png"));
		g.drawImage(enemy.getImage(), myX, myY, null);
	}

}
