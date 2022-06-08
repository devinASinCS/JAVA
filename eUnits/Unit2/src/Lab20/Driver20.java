package Lab20;

import javax.swing.JFrame;

public class Driver20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new PrizePanel());
		frame.setVisible(true);
	}

}
