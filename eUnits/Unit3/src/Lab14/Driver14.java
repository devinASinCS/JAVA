package Lab14;

import javax.swing.JOptionPane;

public class Driver14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to bowling scoring system!");
		int score = 0;
		
		while(true) {
			for(int frame = 1; frame <= 10; ++frame) {
				int ball = 10;
				
				int pin1 = Integer.parseInt(JOptionPane.showInputDialog("Score: " + score + "\nFrame " + frame +", Ball " + ball));
				while(pin1 > 10) {
					pin1 = Integer.parseInt(JOptionPane.showInputDialog("Invalid input! Try again\nScore: " + score + "\nFrame " + frame +", Ball " + ball));
				}
				
				ball -= pin1;
				score += pin1;
				if(ball > 0) {
					int pin2 = Integer.parseInt(JOptionPane.showInputDialog("Score: " + score + "\nFrame " + frame +", Ball " + ball));
					while(pin1 + pin2 > 10) {
						pin2 = Integer.parseInt(JOptionPane.showInputDialog("Invalid input! Try again\nScore: " + score + "\nFrame " + frame +", Ball " + ball));
					}
					score += pin2;
				}
			}
			if(Integer.parseInt(JOptionPane.showInputDialog(null, "Excellent!\nYou score " + score + " points\n(enter 1 to continue)")) != 1) {
				System.exit(0);
			}
		}
	}

}
