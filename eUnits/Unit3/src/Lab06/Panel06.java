//Name______________________________ Date_____________
package Lab06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel06 extends JPanel {
	private Dice dice;
	private JLabel label;

	public Panel06() {
		setLayout(new FlowLayout());

		dice = new Dice();
		add(dice);

		JButton button = new JButton("Roll");
		button.addActionListener(new Listener());
		add(button);

		label = new JLabel("");
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		label.setForeground(Color.blue);
		add(label);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int i = dice.roll();
			if(i == 7) {
				label.setText("Winner!");
			}else {
				label.setText("");
			}

		}
	}
}