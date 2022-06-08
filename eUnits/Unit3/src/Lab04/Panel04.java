package Lab04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel04 extends JPanel {
	private Odometer odometer;

	public Panel04() {
		setLayout(new FlowLayout());

		odometer = new Odometer();
		add(odometer);

		JButton button = new JButton("Step");
		button.addActionListener(new Listener());
		add(button);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			odometer.update();
		}
	}

}
