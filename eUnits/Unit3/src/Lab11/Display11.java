package Lab11;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Display11 extends JPanel {
	private JLabel stones;
	private int num = 12;

	public Display11() {
		setLayout(new GridLayout(1, 1));

		stones = new JLabel();
		stones.setHorizontalAlignment(SwingConstants.CENTER);
		stones.setIcon(new ImageIcon("src/Lab11/stones12.jpg"));
		add(stones);
	}

	public boolean pickUp(int x) {
		if (num > 0) {
			num -= x;
		}
		if(num <= 0) {
			num = 12;
		}
		stones.setIcon(new ImageIcon("src/Lab11/stones" + num + ".jpg"));
		return num == 12;
		
	}
}
