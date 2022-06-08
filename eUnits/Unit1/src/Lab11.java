import edu.fcps.Digit;
import edu.fcps.karel2.Display;

public class Lab11 {

	public static void main(String[] args) {
		Display.openDefaultWorld();
		Display.setSize(48,32);
		Display.setSpeed(10);
		
		new One(1,9).display();
		new Zero(7,9).display();
		new Eight(13,9).display();
		new Three(19,9).display();
		new Zero(25,9).display();
		new Zero(31,9).display();
		new Zero(37,9).display();
		new Nine(43,9).display();
	}
}
