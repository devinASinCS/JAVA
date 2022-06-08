package P2;

import java.awt.Color;

import javax.swing.JFrame;


public class B10830009_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("B10830009_P2");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setContentPane(new Panel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		StarTurtle t = new StarTurtle(275,250);
		t.setColor(Color.white);
		t.clear(Color.blue);
		t.drawShape();
	}

}
