package Lab05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class BugPanel extends JPanel {
	private BufferedImage myImage;
	final int N = 400;

	public BugPanel() {
		myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
		Graphics buffer = myImage.getGraphics();
		buffer.setColor(Color.BLUE);
		buffer.fillRect(0, 0, N, N);
		buffer.setColor(Color.YELLOW);

		Bug topLeft = new Bug(0, 0);
		Bug topRight = new Bug(N, 0);
		Bug botLeft = new Bug(0, N);
		Bug botRight = new Bug(N, N);
		while (!(topLeft.sameSpot(topRight) || topRight.sameSpot(botRight) || botRight.sameSpot(botLeft)
				|| botLeft.sameSpot(topLeft))) {
			topLeft.walkTowards(topRight, 0.1);
			topRight.walkTowards(botRight, 0.1);
			botRight.walkTowards(botLeft, 0.1);
			botLeft.walkTowards(topLeft, 0.1);
			buffer.drawLine(topLeft.getX(), topLeft.getY(), topRight.getX(), topRight.getY());
			buffer.drawLine(topRight.getX(), topRight.getY(), botRight.getX(), botRight.getY());
			buffer.drawLine(botRight.getX(), botRight.getY(), botLeft.getX(), botLeft.getY());
			buffer.drawLine(botLeft.getX(), botLeft.getY(), topLeft.getX(), topLeft.getY());
		}
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}
}