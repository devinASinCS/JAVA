package Lab03;

import javax.swing.JFrame;

import Lab02.Panel02;

public class Driver03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel03());
		frame.setVisible(true);
	}

}
