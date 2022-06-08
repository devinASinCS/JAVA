package Lab01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel01 extends JPanel {
	private JLabel label; // field
	private JTextField box; // field

	public Panel01() {
		setLayout(new FlowLayout());

		box = new JTextField("0.0", 10);
		box.setHorizontalAlignment(SwingConstants.RIGHT);
		add(box);

		JButton button = new JButton("SQRT"); // local
		button.addActionListener(new Listener());
		add(button);

		label = new JLabel("0.0");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setForeground(Color.blue);
		add(label);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// get the number
			// take the square root
			double d = Double.parseDouble(box.getText());
			if (d >= 0) {
				d = Math.sqrt(d);
				label.setText("" + d);
			}else {
				d *= -1;
				d = Math.sqrt(d);
				label.setText("" + d +"i");
			}
		}
	}

}
