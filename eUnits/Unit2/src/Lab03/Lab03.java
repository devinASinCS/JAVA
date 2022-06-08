package Lab03;

import javax.swing.JFrame;

public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setLocation(200, 200);
		frame.setContentPane(new Panel03());
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
