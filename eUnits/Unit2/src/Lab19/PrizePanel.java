package Lab19;

//Name:    Date:
import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PrizePanel extends JPanel {
	private static final int FRAME = 400;
	private static final Color BACKGROUND = new Color(204, 204, 204);
	private BufferedImage myImage;
	private Graphics myBuffer;
	private Ball ball;
	private Polkadot pd;
	private Timer t;
	private int hits = 0;
	private Polkadot[] myPDarray;
	private int x, y;
	private static final int PDnum = 50;
	// constructor
	public PrizePanel() {
		myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, FRAME, FRAME);
		int xPos = (int) (Math.random() * (FRAME - 100) + 50);
		int yPos = (int) (Math.random() * (FRAME - 100) + 50);
		ball = new Ball(xPos, yPos, 50, Color.BLACK);
		
		myPDarray = new Polkadot[PDnum];
		for(int k = 0; k < myPDarray.length; ++k) {
			x = (int)(Math.random() * FRAME);
			y = (int)(Math.random() * FRAME);
			myPDarray[k] = new Polkadot(x, y, 25, Color.RED);
		}
		t = new Timer(5, new Listener());
		t.start();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0,0,FRAME,FRAME);
			
			ball.move(FRAME, FRAME);
			collide(ball, myPDarray);
			
			ball.draw(myBuffer);
			for(Polkadot pd : myPDarray) {
				pd.draw(myBuffer);
			}
			
			myBuffer.setColor(Color.BLACK);
			myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
			myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
			repaint();

		}
	}

	private void collide(Ball b, Polkadot[] myPDarray) {
		for(int i = 0; i < PDnum; ++i) {
			double d = distance(b.getX(), b.getY(), myPDarray[i].getX(), myPDarray[i].getY());
			if(d <= b.getRadius() + myPDarray[i].getRadius()) {
				++hits;
				myPDarray[i].jump(FRAME, FRAME);
			}
		}
	}

	private double distance(double x1, double y1, double x2, double y2)
      {
         return  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));	 // enter the calculation here.
      }
}