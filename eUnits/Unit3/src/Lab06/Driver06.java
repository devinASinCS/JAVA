package Lab06;

import javax.swing.JFrame;

public class Driver06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(250,250);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel06());
		frame.setVisible(true);
	}

}
