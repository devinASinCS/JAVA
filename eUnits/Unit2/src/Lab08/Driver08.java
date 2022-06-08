//Name______________________________ Date_____________
package Lab08;

import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;

import Lab06.TurtlePanel;

public class Driver08 {
	public static void main(String[] args) {

		JFrame frame = new JFrame("flower turtle");
		frame.setSize(400,400);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TurtlePanel());
		frame.setVisible(true);
		
		Turtle.clear(Color.WHITE);
		FlowerTurtle lisa = new FlowerTurtle(100, 25, Color.BLUE);
		lisa.drawShape();
		
		FlowerTurtle lily = new FlowerTurtle(200, 25, Color.RED);
		lily.drawShape();
		
		FlowerTurtle leisly = new FlowerTurtle(300, 25, Color.YELLOW);
		leisly.drawShape();
		
		FlowerTurtle maylisa = new FlowerTurtle(400, 25, Color.PINK);
		maylisa.drawShape();
	}
}