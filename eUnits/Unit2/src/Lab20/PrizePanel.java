package Lab20;

//Name:    Date:
import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PrizePanel extends JPanel {
	private static final int FRAME = 800;
	private static final Color BACKGROUND = new Color(204, 204, 204);
	private BufferedImage myImage;
	private Graphics myBuffer;
	private Prize[] pd;
	private Pinball pb;
	private Timer t;
	private int hits = 0;
	private int x, y;
	private static final int num = 500;

	// constructor
	public PrizePanel() {
		myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, FRAME, FRAME);
		int xPos = (int) (Math.random() * (FRAME - 100) + 50);
		int yPos = (int) (Math.random() * (FRAME - 100) + 50);
		pb = new Pinball(xPos, yPos, 10, Color.BLACK);
		pb.setBound(FRAME, FRAME);
		pd = new Prize[num];
		for (int i = 0; i < num; ++i) {
			x = (int) (Math.random() * FRAME);
			y = (int) (Math.random() * FRAME);
			pd[i] = new Prize(x, y, (int)(Math.random() *10 +10), Color.RED);
		}
		t = new Timer(5, new Listener());
		t.start();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(Color.WHITE);
			myBuffer.fillRect(0, 0, FRAME, FRAME);
			for (int k = 0; k < num; k++) {
				if (pb.intersect(pd[k])) {
					pd[k].lightUp();
					hits++;
				}
				pd[k].drawMe(myBuffer);
			}
			pb.tick();
			pb.drawMe(myBuffer);
			repaint();

		}
	}

}