package Lab10;

import javax.swing.JFrame;

import Lab09.Panel09;

public class Driver10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(250, 250);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel10());
		frame.setVisible(true);
	}

}
