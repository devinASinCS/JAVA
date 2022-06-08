//Name______________________________ Date_____________
package Lab08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel08 extends JPanel {
	private Display08 display;

	public Panel08() {
		setLayout(new BorderLayout());

		display = new Display08();
		add(display, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton finite = new JButton("Finite");
		finite.addActionListener(new Listener1());
		panel.add(finite);

		JButton infinite = new JButton("Infinite");
		infinite.addActionListener(new Listener2());
		panel.add(infinite);
	}

	private class Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			display.sumFinite();

		}
	}

	private class Listener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			display.sumInfinite();

		}
	}
}