package Lab11;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel11 extends JPanel {
	private Scoreboard scoreboard;
	private Display11 display;
	private int turn = 0;
	private boolean win;
	public Panel11() {
		setLayout(new BorderLayout());

		scoreboard = new Scoreboard();
		add(scoreboard, BorderLayout.NORTH);

		display = new Display11();
		add(display, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		add(panel, BorderLayout.SOUTH);
		JButton button1 = new JButton("One");
		button1.addActionListener(new Listener1());
		panel.add(button1);
		JButton button2 = new JButton("Two");
		button2.addActionListener(new Listener2());
		panel.add(button2);
		JButton button3 = new JButton("Three");
		button3.addActionListener(new Listener3());
		panel.add(button3);
	}
	
	public class Listener1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			++turn;
			win = display.pickUp(1);
			switch(turn % 2) {
			case 1:
				scoreboard.updateOne(1, win);
				break;
			case 0:
				scoreboard.updateTwo(1, win);
				break;
			}
		}
		
	}
	public class Listener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			++turn;
			win = display.pickUp(2);
			switch(turn % 2) {
			case 1:
				scoreboard.updateOne(2, win);
				break;
			case 0:
				scoreboard.updateTwo(2, win);
				break;
			}
		}
		
	}
	public class Listener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			++turn;
			win = display.pickUp(3);
			switch(turn % 2) {
			case 1:
				scoreboard.updateOne(3, win);
				break;
			case 0:
				scoreboard.updateTwo(3, win);
				break;
			}
		}
		
	}
}
