package Lab16;

import javax.swing.JFrame;


public class Driver16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Unit2, Lab15: Karel the Robot");
		frame.setSize(408,438);
		frame.setLocation(175, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new PrizePanel());
		frame.setVisible(true);
	}

}
