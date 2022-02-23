import edu.fcps.karel2.Display;

public class Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/maze.map");
		Display.setSize(8, 8);
		Athlete athlete = new Athlete();
		athlete.putAndMove(1);
		athlete.turnRight();
		athlete.putAndMove(1);
		athlete.turnRight();
		athlete.putAndMove(1);
		athlete.turnLeft();
		athlete.putAndMove(1);
		athlete.turnLeft();
		athlete.putAndMove(1);
		athlete.turnRight();
		athlete.putAndMove(2);
		athlete.turnRight();
		athlete.putAndMove(1);
		athlete.turnLeft();
		athlete.putAndMove(1);
		athlete.turnLeft();
		athlete.putAndMove(4);
		athlete.turnRight();
		athlete.putAndMove(2);
	}

}
