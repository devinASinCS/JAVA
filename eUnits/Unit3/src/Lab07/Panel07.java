package Lab07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel07 extends JPanel {
	private Display07 display;

	public Panel07() {
		setLayout(new FlowLayout());

		display = new Display07();
		add(display);

		JButton GCD = new JButton("GCD");
		GCD.addActionListener(new gcdListener());
		add(GCD);

		JButton LCM = new JButton("LCM");
		LCM.addActionListener(new lcmListener());
		add(LCM);
	}

	public class gcdListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display.showGCD();
		}
	}

	public class lcmListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display.showLCM();
		}
	}
}
