package Lab13;

import javax.swing.JFrame;

public class Driver13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(700, 500);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ProjectPanel());
		frame.setVisible(true);
	}

}
