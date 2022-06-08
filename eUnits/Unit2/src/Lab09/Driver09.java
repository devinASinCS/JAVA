package Lab09;

import java.awt.Color;

import javax.swing.JFrame;

import Lab06.TurtlePanel;
import edu.fcps.Turtle;

public class Driver09 {

	public static void twisties(Turtle arg) {
		arg.setPenDown(false);
		arg.turnRight((int) (Math.random() * 360));
		arg.forward((int) (Math.random() * 200));
		arg.setPenDown(true);
		arg.drawShape();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("twisty");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TurtlePanel());
		frame.setVisible(true);

		Turtle.clear(Color.WHITE);
		TwistyTurtle twist1 = new TwistyTurtle();
		twisties(twist1);
		
		TwistyTurtle2 twist2 = new TwistyTurtle2();
		twist2.setColor(Color.blue);
		twisties(twist2);
		
		TwistyTurtle3 twist3 = new TwistyTurtle3();
		twist3.setColor(Color.RED);
		twisties(twist3);
	}

}
