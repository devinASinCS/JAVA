package Lab14;

import javax.swing.JFrame;

public class Driver14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BumperPanel());
		frame.setVisible(true);
	}

}
