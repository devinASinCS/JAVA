import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mapOption = {"path1", "path2", "path3"};
		String filename = (String)JOptionPane.showInputDialog(null, "What robot world?", null, JOptionPane.QUESTION_MESSAGE, null, mapOption, "map1");
		Display.openWorld("maps/" + filename + ".map");
		Display.setSize(10, 10);
		Display.setSpeed(8);
		
		Dorothy dorothy = new Dorothy();
		
		dorothy.followPath();
		
		while(dorothy.findPath()) {
			dorothy.followPath();
		}
	}

}
