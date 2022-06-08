package Lab13;

//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;

public class ScoreCard13 extends JPanel {
	private JTextField[][] input;

	public ScoreCard13() {
		setLayout(new GridLayout(5, 18));

		for (int x = 1; x <= 18; x++) {
			add(new JLabel("" + x, SwingConstants.CENTER));
		}

		input = new JTextField[4][18];
		for (int x = 0; x < input.length; x++)
			for (int y = 0; y < input[0].length; y++) {
				input[x][y] = new JTextField();
				add(input[x][y]);
			}
	}

	public void randomize() {
		for(int i = 0; i < 4; ++i) {
			for(int j = 0; j < 18; ++j) {
				input[i][j].setText("" + (int)(Math.random() * 5 + 1));
			}
		}
	}

	public int findTotal(int x) {
		int total = 0;
		for(int i = 0; i < 18; ++i) {
			total += Integer.parseInt(input[x][i].getText());
		}
		return total;
	}

	public int findAces(int x) {
		int count = 0;
		for(int i = 0; i < 18; ++i) {
			if(Integer.parseInt(input[x][i].getText()) == 1) {
				++count;
			}
		}
		return count;
	}

	public int findHardestHole(int x) {
		int max = 0, maxPos = 0;
		for(int i = 0; i < 18; ++i) {
			if(max < Integer.parseInt(input[x][i].getText())) {
				max = Integer.parseInt(input[x][i].getText());
				maxPos = i + 1;
			}
		}
		return maxPos;
	}

	public int findHardestHole() {
		int max = 0, maxPos = 0;
		int[] totals = new int[18];
		for(int i = 0; i < 18; ++i) {
			for(int j = 0; j < 4; ++j) {
				totals[i] += Integer.parseInt(input[j][i].getText());
			}
			if(totals[i] > max) {
				max = totals[i];
				maxPos = i + 1;
			}
		}
		return maxPos;
	}
}