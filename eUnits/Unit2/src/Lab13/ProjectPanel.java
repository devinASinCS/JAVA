package Lab13;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ProjectPanel extends JPanel {
	private static final ImageIcon THOMAS = new ImageIcon("src/Lab02/tj.jpg");
	private static final Color BACKGROUND = new Color(204, 204, 204);
	private BufferedImage myImage;
	private Graphics2D myBuffer;
	private Timer t1, t2;
	private int xPos;

	public ProjectPanel() {
		xPos = 50;
		myImage = new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
		myBuffer = (Graphics2D) myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, 700, 500);
		t1 = new Timer(100, new Listener1());
		t2 = new Timer(5000, new Listener2());
		t1.start();
		t2.start();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(xPos < 200) {
			myBuffer.setColor(BACKGROUND); // cover the
			myBuffer.fillRect(0, 0, 700, 500);
			myBuffer.drawImage(THOMAS.getImage(), xPos, 50, 75, 100, null);
			myBuffer.setStroke(new BasicStroke(10.0f));
			myBuffer.setColor(Color.BLUE);
			myBuffer.drawLine(xPos + 37, 150, xPos + 37, 300);
			myBuffer.drawLine(xPos + 37, 300, xPos + 87, 350);
			myBuffer.drawLine(xPos + 37, 300, xPos - 13, 350);
			myBuffer.drawLine(xPos + 37, 200, xPos + 87, 150);
			myBuffer.drawLine(xPos + 37, 200, xPos - 13, 150);
			
			xPos += 5;
			}else {
				myBuffer.setColor(Color.BLACK);
				myBuffer.setFont(new Font("Monospaced", Font.PLAIN, 15));
				myBuffer.drawString("或產穦谋眔硂瓣羆参ㄆ还〡克?", 325, 100);
				myBuffer.setStroke(new BasicStroke(5.0f));
				myBuffer.drawOval(290, 65, 400, 60);
				t1.stop();
			}
			repaint();
		}

	}

	private class Listener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(Color.RED);
			myBuffer.setFont(new Font("Monospaced", Font.BOLD|Font.ITALIC, 20));
			myBuffer.drawString("產常:傣﹊ㄆ﹏ひ还", 325, 250);

			repaint();
			t2.stop();
		}

	}
}
