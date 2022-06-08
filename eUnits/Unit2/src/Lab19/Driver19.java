package Lab19;

import javax.swing.JFrame;

public class Driver19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new PrizePanel());
		frame.setVisible(true);
	}

}
