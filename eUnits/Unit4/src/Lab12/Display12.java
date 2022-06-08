package Lab12;

//Name______________________________ Date_____________
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Display12 extends JPanel {
	private JButton[] button;

	public Display12(ActionListener lis) {
		setLayout(new GridLayout(5, 5, 5, 5));

		button = new JButton[25];
		for (int x = 0; x < 25; x++) {
			button[x] = new JButton("" + (x + 1));
			button[x].addActionListener(lis);
			button[x].setHorizontalAlignment(SwingConstants.CENTER);
			button[x].setFont(new Font("Serif", Font.BOLD, 20));
			button[x].setBackground(Color.yellow);
			add(button[x]);
		}
	}

	public void reset() {
		for (int i = 0; i < button.length; ++i) {
			button[i].setOpaque(true);
			button[i].setEnabled(true);
		}
	}

	public void displayWinner(int target) {
		for(int i = 0; i < button.length; ++i) {
			if(i == target - 1) {
				button[target - 1].setBackground(Color.CYAN);
				continue;
			}
			button[i].setOpaque(true);
			button[i].setEnabled(false);
		}
	}

	public void displayLoser(int target) {
		for (int i = 0; i < button.length; ++i) {
			button[i].setEnabled(false);
		}
	}

	public void displayTooHigh(int guess) {
		button[guess - 1].setEnabled(false);
	}

	public void displayTooLow(int guess) {
		button[guess - 1].setEnabled(false);
	}
}