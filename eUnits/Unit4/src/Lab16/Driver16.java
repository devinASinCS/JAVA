package Lab16;

import javax.swing.JFrame;

public class Driver16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Unit4, Lab16: Mastermind");
        frame.setSize(310, 310);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel16());
        frame.setVisible(true);
	}

}
