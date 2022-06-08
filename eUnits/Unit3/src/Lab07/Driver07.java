package Lab07;

import javax.swing.JFrame;

import Lab06.Panel06;

public class Driver07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(250,300);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel07());
		frame.setVisible(true);
	}

}
