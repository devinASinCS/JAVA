package P2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

import edu.fcps.Turtle;

public class Panel extends JPanel {
	private static final int FRAME = 400;
	private static final Color BACKGROUND = Color.blue;
	private BufferedImage img;
	private Graphics buffer;
	
	public Panel() {
		img = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
		buffer = img.getGraphics();
		
		buffer.setColor(Color.blue);
		buffer.fillRect(0, 0, FRAME, FRAME);
		
		
		
		Timer timer = new Timer(5, new Listener());
		timer.start();
		
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, FRAME, FRAME, null);
		g.drawImage(Turtle.getImage(), 0, 0, FRAME, FRAME, null);
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			repaint();
		}
		
	}
}
