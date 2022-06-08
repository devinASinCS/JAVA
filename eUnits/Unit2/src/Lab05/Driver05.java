package Lab05;

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

public class Driver05 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Bugs");
		frame.setSize(400, 400);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BugPanel());
		frame.setVisible(true);
	}
}