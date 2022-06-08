package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PolkaDotPanel extends JPanel {
	// constants
	private static final int FRAME = 400;
	private static final Color BACKGROUND = new Color(204, 204, 204);
	// fields
	private BufferedImage myImage;
	private Graphics myBuffer;
	private Timer t;
	private Polkadot pd1, pd2;
	private int xPos, yPos;

	public PolkaDotPanel() {
		myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, FRAME, FRAME);
		pd1 = new Polkadot();
		pd2 = new Polkadot();
		pd2.setColor(Color.GREEN);
		t = new Timer(1000, new Listener());
		t.start();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, FRAME, FRAME);
			pd1.jump(FRAME, FRAME);
			pd1.draw(myBuffer);
			pd2.jump(FRAME, FRAME);
			pd2.draw(myBuffer);

			repaint();
		}
	}
}