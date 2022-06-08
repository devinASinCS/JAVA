import edu.fcps.karel2.Display;

public class midterm_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openDefaultWorld();
		Display.setSize(30, 30);
		Display.setSpeed(6);
		
		Thread E1 = new Thread(new epsilon(1,9));
		Thread E2 = new Thread(new epsilon(8,9));
		
		E1.start();
		E2.start();
	}

}
