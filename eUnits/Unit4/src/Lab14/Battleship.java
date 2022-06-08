package Lab14;

//Name______________________________ Date_____________
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Battleship extends JPanel {
	private JButton[][] board;
	private int[][] matrix;
	private int hits, torpedoes;
	private JLabel label;
	private JButton reset;

	public Battleship() {
		setLayout(new BorderLayout());
		hits = 0;
		torpedoes = 20;

		JPanel north = new JPanel();
		north.setLayout(new FlowLayout());
		add(north, BorderLayout.NORTH);
		label = new JLabel("Welcome to Battleship -- You have 20 torpedoes.");
		north.add(label);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(10, 10));
		add(center, BorderLayout.CENTER);

		board = new JButton[10][10];
		matrix = new int[10][10];
		for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 10; c++) {
				board[r][c] = new JButton();
				board[r][c].setBackground(Color.blue);
				board[r][c].addActionListener(new Handler1(r, c));
				center.add(board[r][c]);
			}
		}

		reset = new JButton("Reset");
		reset.addActionListener(new Handler2());
		reset.setEnabled(false);
		add(reset, BorderLayout.SOUTH);

		placeShip();
	}

	private void placeShip() {
		if (Math.random() > 0.5) {
			// place horizontally
			int x = (int) (Math.random() * 7);
			int y = (int) (Math.random() * 10);
			for (int i = 0; i < 4; ++i) {
				matrix[y][x + i] = 1;
			}
		} else {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 7);
			for (int i = 0; i < 4; ++i) {
				matrix[y + i][x] = 1;
			}
		}
	}

	private class Handler1 implements ActionListener {
		private int myRow, myCol;

		public Handler1(int r, int c) {
			myRow = r;
			myCol = c;
		}

		public void actionPerformed(ActionEvent e) {
			// board
			torpedoes--;
			if (matrix[myRow][myCol] == 1) {
				board[myRow][myCol].setBackground(Color.red);
				hits++;
				label.setText("Hit it! -- You still hava " + torpedoes + " torpedoes.");
			} else {
				board[myRow][myCol].setBackground(Color.white);
				label.setText("Miss! -- You still hava " + torpedoes + " torpedoes.");
			}
			if (hits == 4) {
				label.setText("You win!");
				reset.setEnabled(true);
			} else if (torpedoes == 0) {
				label.setText("Run out of torpedoes! Try again.");
				reset.setEnabled(true);
			}
		}
	}

	private class Handler2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// reset
			hits = 0;
			torpedoes = 20;
			for (int r = 0; r < 10; r++) {
				for (int c = 0; c < 10; c++) {
					board[r][c].setBackground(Color.blue);
				}
			}
			placeShip();
			reset.setEnabled(false);
		}
	}
}