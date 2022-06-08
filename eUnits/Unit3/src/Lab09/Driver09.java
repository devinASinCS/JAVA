package Lab09;

import javax.swing.JFrame;

import Lab08.Panel08;

public class Driver09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(250, 250);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel09());
		frame.setVisible(true);
	}

}
