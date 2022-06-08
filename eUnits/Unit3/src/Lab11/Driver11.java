package Lab11;

import javax.swing.JFrame;

import Lab10.Panel10;

public class Driver11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(250, 300);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel11());
		frame.setVisible(true);
	}

}
