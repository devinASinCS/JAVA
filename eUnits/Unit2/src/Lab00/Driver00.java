package Lab00;

import javax.swing.JFrame;

public class Driver00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Lab00");
		frame.setSize(400, 225);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Pane100()); 
		frame.setVisible(true);
	}

}
