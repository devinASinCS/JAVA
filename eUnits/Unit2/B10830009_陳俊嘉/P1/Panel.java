package P1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Panel extends JPanel {
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 600;
	private static final Color BACKGROUND = new Color(200, 200, 200);
	private BufferedImage img;
	private Graphics buffer;
	private Ball ball;
	private Polkadot pd;
	private int startX, startY, endX, endY;
	private int hits = 0;
	private double speedX, speedY;

	public Panel() {
		img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		buffer = img.getGraphics();
		buffer.setColor(BACKGROUND);
		buffer.fillRect(0, 0, WIDTH, HEIGHT);
		buffer.setColor(Color.blue);
		buffer.fillRect(300, 300, 700, 300);
		buffer.setColor(Color.black);
		buffer.setFont(new Font("serif", Font.BOLD, 30));
		buffer.drawString("Points: " + hits, 60, 50);

		ball = new Ball(80, 520, 40, Color.black);
		ball.setdx(0);
		ball.setdy(0);
		ball.draw(buffer);

		pd = new Polkadot(300, 300, 25, Color.red);
		pd.draw(buffer);

		Timer timer = new Timer(5, new Listener());
		timer.start();

		addMouseListener(new drag());

	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			buffer.setColor(BACKGROUND);
			buffer.fillRect(0, 0, WIDTH, HEIGHT);
			buffer.setColor(Color.blue);
			buffer.fillRect(300, 300, 700, 300);
			
			buffer.setColor(Color.black);
			buffer.setFont(new Font("serif", Font.BOLD, 30));
			buffer.drawString("Points: " + hits, 60, 50);

			ball.move(WIDTH, HEIGHT);
			ball.draw(buffer);
			pd.draw(buffer);
			collide(ball, pd);

			repaint();
		}
	}

	private class drag implements MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			endX = e.getX();
			endY = e.getY();
			
		}
		public void mouseReleased(MouseEvent e) {
			speedX = 80 - endX;
			speedY = 520 - endY;
			ball.setdx(speedX);
			ball.setdy(speedY);
		}
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			startX = e.getX();
//			startY = e.getY();
//
//		}
//
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			endX = e.getX();
//			endY = e.getY();
//			ball.setdx((startX - endX) / 5);
//			ball.setdy((startY - endY) / 5);
//			ball.getdx();
//			ball.getdy();
//			
//		}


	}

	private void collide(Ball b, Polkadot p) {

		double d = distance(b.getX(), b.getY(), p.getX(), p.getY());
		if (d <= b.getRadius() + p.getRadius()) {
			++hits;
			p.jump(700, 300);
			b.setdx(0);
			b.setdy(0);
			b.reset();
		}

	}

	private double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // enter the calculation here.
	}
}
