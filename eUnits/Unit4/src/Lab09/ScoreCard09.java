package Lab09;

//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;

public class ScoreCard09 extends JPanel {
	private JTextField[] input;

	public ScoreCard09() {
		setLayout(new GridLayout(2, 18));

		for (int x = 1; x <= 18; x++) {
			add(new JLabel("" + x, SwingConstants.CENTER));
		}

		input = new JTextField[18];
		for (int x = 0; x < input.length; x++) {
			input[x] = new JTextField();
			add(input[x]);
		}
	}

	public void randomize() {
		for(int i = 0; i < input.length; ++i) {
			input[i].setText("" + (int)(Math.random() * 12 + 1)); 
		}
	}

	public int findTotal() {
		int sum = 0;
		for (int i = 0; i < input.length; ++i) {
			sum += Integer.parseInt(input[i].getText());
		}
		return sum;
	}

	public int findAces() {
		int num = 0;
		for (int i = 0; i < input.length; ++i) {
			if (Integer.parseInt(input[i].getText()) == 1) {
				num++;
			}
		}
		return num;
	}

	public int findHardestHole() {
		int max = Integer.parseInt(input[0].getText());
		int maxPos = 0;
		for (int i = 1; i < input.length; ++i) {
			if (max < Integer.parseInt(input[i].getText())) {
				max = Integer.parseInt(input[i].getText());
				maxPos = i;
			}
		}
		return (maxPos + 1 );
	}
}