package P3;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] options = { "pile1", "pile2", "pile3" };
		String mapName = (String) JOptionPane.showInputDialog(null, "which map?", "choose map",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		Display.openWorld("maps/" + mapName + ".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);

		Athlete shifter = new Athlete(1, 1, Display.EAST, 0);
		Queue<Integer> nums = new LinkedList<Integer>();
		nums.add(0);
		nums.add(0);
		int curNum = 0;
		int putNum = 0;
		for (int i = 0; i < 9; i++) {
			while (shifter.nextToABeeper()) {
				shifter.pickBeeper();
				curNum++;
			}
			nums.add(curNum);
			curNum = 0;
			putNum = nums.poll();
			for(int j = 0; j < putNum; j++) {
				shifter.putBeeper();
			}
			shifter.move();
		}
	}

}
