package Lab02;

import javax.swing.JFrame;

public class Driver02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Multiple bottoms");
		frame.setSize(400, 150);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
	}

}
