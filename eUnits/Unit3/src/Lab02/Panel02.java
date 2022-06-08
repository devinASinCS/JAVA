package Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel02 extends JPanel {
	JLabel label;
	public Panel02() // constructor
	{
		label = new JLabel("0.0000000000000000");
		label.setFont(new Font("Serif", Font.BOLD, 40));
		label.setForeground(Color.blue);
		add(label);
		
		JButton randomButton = new JButton("Random");
		randomButton.addActionListener(new RandomListener());
		add(randomButton);
		
		JButton cubeButton = new JButton("Cube Root");
		cubeButton.addActionListener(new CubeListener());
		add(cubeButton);
		
		JButton reciprocalButton = new JButton("Reciprocal");
		reciprocalButton.addActionListener(new ReciprocalListener());
		add(reciprocalButton);
		
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new QuitListener());
		add(quitButton);
	}

	private class RandomListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double x = Math.random();
			label.setText("" + x);
		}
	}

	private class CubeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double x = Double.parseDouble(label.getText());
			x = Math.pow(x, 3);
			label.setText("" + x);
		}
	}

	private class ReciprocalListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double x = Double.parseDouble(label.getText());
			x *= -1;
			label.setText("" + x);
		}
	}

	private class QuitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
