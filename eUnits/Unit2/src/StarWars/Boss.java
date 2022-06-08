package StarWars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Boss extends JPanel {

	private int myX;
	private int myY;
	private int mywidth; 
	private int myheight;
	private int stepX = 3;
	private int stepY = 3;

	public Boss() {
		myX = 10;
		myY = 10;
		mywidth = 60;
		myheight = 70;
	}

	public Boss(int x, int y, int w, int h) {
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

	public void move(int right, int bottom) {
		if(myX < right-mywidth && myX > 0 ) {
			myX = myX + stepX;
		}
		else if(myX >= right-mywidth) {
			stepX = -stepX;
			myX = myX + stepX;
		}
		else if(myX <= mywidth/2) {
			stepX = -stepX;
			myX = myX + stepX;
		}
		if(myY < bottom - myheight && myY > 0) {
			myY = myY + stepY;
		}
		else if(myX >=bottom-myheight/2) {
			stepY = -stepY;
			myY = myY + stepY;
		}
		else if(myX <= myheight/2) {
			stepY = -stepY;
			myY = myY + stepY;
		}
	}

	public void draw(Graphics g) {
		ImageIcon enemy = new ImageIcon(Boss.class.getResource("blackDrag.png"));
		g.drawImage(enemy.getImage(), myX, myY, null);
	}

}
