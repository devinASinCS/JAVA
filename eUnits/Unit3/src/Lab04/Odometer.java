package Lab04;

import javax.swing.*;
import java.awt.*;

public class Odometer extends JPanel {
	JLabel hunds, tens, units;
	int num;

	public Odometer() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.BLACK);
		add(panel);
		
		hunds = new JLabel("0");
		hunds.setFont(new Font("Serif", Font.BOLD, 30));
		hunds.setBackground(Color.BLACK);
		hunds.setForeground(Color.WHITE);
		panel.add(hunds);
		
		tens= new JLabel("0");
		tens.setFont(new Font("Serif", Font.BOLD, 30));
		tens.setBackground(Color.BLACK);
		tens.setForeground(Color.WHITE);
		panel.add(tens);
		
		units = new JLabel("0");
		units.setFont(new Font("Serif", Font.BOLD, 30));
		units.setBackground(Color.BLACK);
		units.setForeground(Color.WHITE);
		panel.add(units);
	}

	public void update() {
		++num;
		if(num < 100) {
			hunds.setText("0");;
			tens.setText("" + (num / 10));
			units.setText("" + (num % 10));
		}else {
			hunds.setText("" + (num / 100));
			tens.setText("" + ((num % 100) / 10));
			units.setText("" + (num % 10));
		}
	}
}