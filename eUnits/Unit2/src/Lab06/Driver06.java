package Lab06;


import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;

public class Driver06 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Square Turtles");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TurtlePanel());
		frame.setVisible(true);

		Turtle.setCrawl(true); // a class method

		SquareTurtle smidge = new SquareTurtle();
		smidge.setColor(Color.BLUE);
		smidge.setThickness(6);
		smidge.drawShape();

		smidge = new SquareTurtle(100, 250, -45, 30);
		smidge.setColor(Color.RED);
		smidge.setThickness(6);
		smidge.drawShape();
		
		smidge = new SquareTurtle(300, 300, 90, 100);
		smidge.setColor(Color.BLUE);
		smidge.setThickness(6);
		smidge.drawShape();
		
		smidge = new SquareTurtle(500, 250, 135, 60);
		smidge.setColor(Color.YELLOW);
		smidge.setThickness(3);
		smidge.drawShape();
		
		smidge.setSize(50);
		smidge.drawShape();
		
		smidge.setSize(40);
		smidge.drawShape();
		
		smidge.setSize(30);
		smidge.drawShape();

	}
}