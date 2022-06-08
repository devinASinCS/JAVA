package Lab01;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Build a House");
		frame.setSize(400,400);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		frame.setVisible(true);
	}

}
