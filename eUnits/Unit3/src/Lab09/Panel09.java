//Name______________________________ Date_____________
package Lab09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel09 extends JPanel {
	private JLabel label;
	private double total;
	
	
	public Panel09() {
		setLayout(new BorderLayout());
		total = 0.0;

		label = new JLabel("$0.00");
		label.setFont(new Font("Serif", Font.BOLD, 60));
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 3, 10, 0));
		add(panel, BorderLayout.CENTER);
		addButton(panel, "+1.00", 1.0);
		addButton(panel, "+0.10", 0.1);
		addButton(panel, "+0.01", 0.01);
		addButton(panel, "-1.00", -1.0);
		addButton(panel, "-0.10", -0.1);
		addButton(panel, "-0.01", -0.01);

	}

	private void addButton(JPanel panel, String s, double x) {
		JButton button = new JButton(s);
		button.addActionListener(new Listener(x));
		panel.add(button);

	}

	private class Listener implements ActionListener {
		private double myX;

		public Listener(double x) {
			myX = x;
		}

		public void actionPerformed(ActionEvent e) {
			total += myX;
			label.setText("$" + total);
		}
	}
}