import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab09 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] options = {"pile1", "pile2", "pile3"};
		String mapName = (String)JOptionPane.showInputDialog(null,"which map?","choose map",JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		Display.openWorld("maps/"+mapName+".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		
		Athlete shifter = new Athlete(1,1,Display.EAST,0);
		int preNum = 0;
		int curNum = 0;
		for(int i = 0; i < 8; ++i) {
			while(shifter.nextToABeeper()) {
				shifter.pickBeeper();
				++curNum;
			}
			for(int j = 0; j < preNum; ++j) {
				shifter.putBeeper();
			}
			preNum = curNum;
			curNum = 0;
			shifter.move();
		}
		shifter.turnAround();
		for(int i = 0; i < 8; ++i) {
			shifter.move();
		}
	}

}
