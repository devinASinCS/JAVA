package Lab11;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Scoreboard extends JPanel {
	private JLabel label1, label2;
	private JPanel panel1, panel2;
	private int count1, count2;
	
	public Scoreboard() {
		setLayout(new GridLayout(1, 3));
	
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		panel1.setBackground(Color.WHITE);
		add(panel1);
		panel1.add(new JLabel("One: ", SwingConstants.RIGHT));
		label1 = new JLabel("0");
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		panel1.add(label1);
		
		add(new JLabel("Nim", SwingConstants.CENTER));
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		add(panel2);
		panel2.add(new JLabel("Two: ", SwingConstants.RIGHT));
		label2 = new JLabel("0");
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		panel2.add(label2);
	}

	public void updateOne(int n, boolean win) {
		if(win) {
			++count1;
		}
		label1.setText("" + count1);
		panel1.setBackground(null);
		panel2.setBackground(Color.WHITE);
		
	}

	public void updateTwo(int n, boolean win) {
		if(win) {
			++count2;
		}
		label2.setText("" + count2);
		panel1.setBackground(Color.WHITE);
		panel2.setBackground(null);
	}
}
