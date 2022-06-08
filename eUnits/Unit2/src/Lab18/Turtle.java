package Lab18;

import java.awt.*;
import java.awt.image.*;

public class Turtle {
	private static BufferedImage img;
	private static int black = 0;
	private static int blue = 255; // 2^8-1
	private static int green = 65280; // (2^8-1)*2^8
	private static int red = 16711680; // (2^8-1)*2^16
	private static int white = 16777215; // 2^24-1
	private double x, y, theta; // what does a Turtle know?
	static // a static initializer list
	{
		img = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
	}

	public Turtle() {
		// img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
		x = img.getWidth() / 2; // start at center
		y = img.getHeight() / 2; // start at center
		theta = 90; // start facing north
	}

	public static Image getImage() {
		return img;
	}

	public void turnLeft(double a) {
		theta += a;
	}

	public void forward(double r) {
		// Your code goes here!
		for(int i = 0; i <= r; ++i) {
			img.setRGB((int)x, (int)y, white);
			x += Math.cos(theta * Math.PI / 180);
			y += Math.sin(theta * Math.PI / 180);
		}
	}
	
	
	public void drawLine(BufferedImage img, int x1, int y1, int x2, int y2) {
		
	}
	
	public void drawCircle(BufferedImage img, int x, int y, int r) {
		
	}
	
	public void drawOval(BufferedImage img, int x, int y, int w, int h) {
		
	}
}