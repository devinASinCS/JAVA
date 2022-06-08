import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab10 {
	public static void followWallsRight(Athlete athlete) {
		while(!athlete.nextToABeeper()) {
			if(athlete.frontIsClear() & athlete.rightIsClear()) {
				athlete.turnRight();
				athlete.move();
			}else if(athlete.frontIsClear() & !athlete.rightIsClear()){
				athlete.move();
			}else if(!athlete.frontIsClear() & athlete.rightIsClear()) {
				athlete.turnRight();
				athlete.move();
			}else if(!athlete.frontIsClear() & !athlete.rightIsClear()) {
				athlete.turnLeft();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] options = {"maze1","maze2","maze3"};
		String map = (String)JOptionPane.showInputDialog(null,"which map?","choose map",JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		Display.openWorld("maps/"+map+".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		
		Athlete mazer = new Athlete(1,1,Display.NORTH,Display.INFINITY);
		followWallsRight(mazer);
	}

}
