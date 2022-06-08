package Lab02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Unit2, Lab02: Our Fearless Leader");
		frame.setSize(400,400);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
	}

}
