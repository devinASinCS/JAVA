package Lab01;

import javax.swing.JFrame;

import Lab00.Panel00;

public class Driver01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(200,150);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		frame.setVisible(true);
	}

}
