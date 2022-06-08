package Lab15;
//Name______________________________ Date_____________

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gameboard15 extends JPanel {
	private JButton[][] board;
	private String gamepiece;
	private Color color;
	private int count;

	public Gameboard15(ActionListener a) {
		gamepiece = "X";
		color = Color.green;
		count = 0;

		setLayout(new GridLayout(3, 3));
		setBackground(Color.black);

		board = new JButton[3][3];
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				board[x][y] = new JButton("-");
				board[x][y].setFont(new Font("Monospaced", Font.PLAIN, 20));
				board[x][y].setBackground(Color.white);
				board[x][y].setFocusPainted(false);
				board[x][y].addActionListener(a); // <---Add this one first!!!!!
				board[x][y].addActionListener(new Listener(x, y));
				add(board[x][y]);
			}
		}
	}

	private class Listener implements ActionListener {
		private int myX, myY;

		public Listener(int x, int y) {
			myX = x;
			myY = y;
		}

		public void actionPerformed(ActionEvent e) {
			if (count % 2 == 0) {
				board[myX][myY].setText(gamepiece);
				board[myX][myY].setBackground(color.gray);
			} else {
				board[myX][myY].setText("O");
				board[myX][myY].setBackground(color.CYAN);
			}
			count++;
		}
	}

	public void freeze() {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				board[i][j].setEnabled(false);
			}
		}
	}

	public void reset() {
		count = 0;
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				board[x][y].setEnabled(true);
				board[x][y].setText("-");
				board[x][y].setBackground(Color.white);
				board[x][y].setFocusPainted(false);
			}
		}
	}

	public boolean filled() {
		return count == 9;
	}

	public boolean winner() {
		boolean win = false;
		for (int i = 0; i < 3; ++i) {
			if (board[i][0].getText().equals(board[i][1].getText())
					&& board[i][0].getText().equals(board[i][2].getText())) {
				if (!board[i][0].getText().equals("-")) {
					win = true;
				}
			}
			if ((board[0][i].getText().equals(board[1][i].getText())
					&& board[0][i].getText().equals(board[2][i].getText()))) {
				if (!board[0][i].getText().equals("-")) {
					win = true;
				}
			}
		}
		if (!board[1][1].getText().equals("-")) {
			if ((board[1][1].getText().equals(board[0][0].getText())
					&& board[1][1].getText().equals(board[2][2].getText()))) {
				win = true;
			}
			if ((board[1][1].getText().equals(board[2][0].getText())
					&& board[1][1].getText().equals(board[0][2].getText()))) {
				win = true;
			}
		}
		return win;
	}
}