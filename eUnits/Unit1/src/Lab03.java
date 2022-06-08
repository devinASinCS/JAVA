import edu.fcps.karel2.Display;

public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("maps/mountain.map");
		Display.setSpeed(9);
		Climber tenzing = new Climber(8);
		Climber tenzing2 = new Climber(8);
		
		tenzing.putBeeper();
		tenzing2.putBeeper();
		tenzing.turnRight();
		tenzing2.turnRight();
		tenzing.move();
		tenzing2.move();
		tenzing.climbUpRight();
		tenzing2.climbUpRight();
		tenzing.climbUpRight();
		tenzing2.climbUpRight();
		tenzing.climbUpRight();
		tenzing2.climbUpRight();
		
		tenzing.climbDownRight();
		tenzing2.climbDownRight();
		tenzing.climbDownRight();
		tenzing2.climbDownRight();
		tenzing.pickBeeper();
		
		tenzing.turnAround();
		tenzing2.turnAround();
		
		tenzing.climbUpLeft();
		tenzing2.climbUpLeft();
		tenzing.climbUpLeft();
		tenzing2.climbUpLeft();
		
		tenzing.climbDownLeft();
		tenzing2.climbDownLeft();
		tenzing.climbDownLeft();
		tenzing2.climbDownLeft();
		tenzing.climbDownLeft();
		tenzing2.climbDownLeft();
		
		tenzing.move();
		tenzing2.move();
		tenzing.pickBeeper();
		tenzing2.pickBeeper();
	}

}
