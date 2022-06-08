package Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel02 extends JPanel {
	public void paintComponent(Graphics g) {
		//background
		g.setColor(Color.RED);
		g.fillRect(0, 0, 400, 400);
		
		//frame
		g.setColor(Color.YELLOW);
		
		int x = 110, y = 85;
		
		for(int i = 0; i < 8; ++i) {
			g.fillOval(x, y, 20, 20);
			x += 20;
		}
		x -= 20;
		for(int i = 0; i < 10; ++i) {
			g.fillOval(x, y, 20, 20);
			y += 20;
		}
		y -= 20;
		for(int i = 0; i < 8; ++i) {
			g.fillOval(x, y, 20, 20);
			x -= 20;
		}
		x += 20;
		for(int i = 0; i < 10; ++i) {
			g.fillOval(x, y, 20, 20);
			y -= 20;
		}
		g.fillRect(120, 95, 140, 180);
		
		//image
		ImageIcon thomas = new ImageIcon("src/Lab02/tj.jpg");
		g.drawImage(thomas.getImage(),125, 100, null);
		
		//word
		g.setColor(Color.WHITE);
		g.setFont(new Font("serif", Font.ITALIC, 30));
		g.drawString("Our Fearless Leader", 60, 320);
	}
}
