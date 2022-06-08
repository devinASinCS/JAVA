package StarWars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class spaceShip extends JPanel {

	private int myX;
	private int myY;
	private int mywidth; 
	private int myheight;
	private int step = 15;
	private int shiptype;

	public spaceShip() {
		myX = 300;
		myY = 650;
		mywidth = 60;
		myheight = 70;
	}

	public spaceShip(int x, int y, int w, int h, int s) {
		myX = x;
		myY = y;
		mywidth = w;
		myheight = h;
		shiptype = s;
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
	public void forward() {
		if (myY > 0) {
			myY -= step;
		}
	}

	public void backward() {
		if(myY < 625) {
			myY += step;
		}
	}

	public void moveRight() {
		if (myX < 450) {
			myX += step;
		}
	}

	public void moveLeft() {
		if (myX > 0) {
			myX -= step;
		}
	}

	public void draw(Graphics g) {
		if(shiptype == 1) {
			ImageIcon ship = new ImageIcon(spaceShip.class.getResource("R0.png"));
			g.drawImage(ship.getImage(), myX, myY, 50, 50, null);
		}
		if(shiptype == 2) {
			ImageIcon ship = new ImageIcon(spaceShip.class.getResource("R1.png"));
			g.drawImage(ship.getImage(), myX, myY, 50, 50, null);
		}
		if(shiptype == 3) {
			ImageIcon ship = new ImageIcon(spaceShip.class.getResource("R2.png"));
			g.drawImage(ship.getImage(), myX, myY, 50, 50, null);
		}
		if(shiptype == 4) {
			ImageIcon ship = new ImageIcon(spaceShip.class.getResource("R3.png"));
			g.drawImage(ship.getImage(), myX, myY, 50, 50, null);
		}
	}

}
