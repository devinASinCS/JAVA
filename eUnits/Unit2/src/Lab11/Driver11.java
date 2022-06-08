package Lab11;

import javax.swing.JFrame;

public class Driver11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Pinball");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new PinballPanel());
		frame.setVisible(true);
	}

}
