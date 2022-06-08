package StarWars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class gameover extends JPanel {

	private int myX;
	private int myY;
	private int mywidth; 
	private int myheight;

	public gameover() {
		myX = 10;
		myY = 10;
		mywidth = 60;
		myheight = 70;
	}

	public gameover(int x, int y, int w, int h) {
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

	public void settwidth(int w) {
		mywidth = w;
	}

	public void setheight(int h) {
		myheight = h;
	}

	public void draw(Graphics g) {
		ImageIcon enemy = new ImageIcon(gameover.class.getResource("gameover.png"));
		g.drawImage(enemy.getImage(), myX, myY, mywidth, myheight, null);
	}

}
