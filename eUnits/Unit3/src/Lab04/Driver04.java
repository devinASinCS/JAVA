package Lab04;

import javax.swing.JFrame;

public class Driver04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Odometer");
		frame.setSize(125,150);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel04());
		frame.setVisible(true);
	}
}