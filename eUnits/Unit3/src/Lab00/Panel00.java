package Lab00;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel00 extends JPanel {
	private JLabel label;
	public Panel00() {
		setLayout(new FlowLayout());

		label = new JLabel("0.0000000000000000");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setForeground(Color.blue);
		add(label);

		JButton button = new JButton("Random");
		button.addActionListener(new Listener());
		add(button);
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double x = Math.random();
			label.setText("" + x);
		}
		
	}
}
