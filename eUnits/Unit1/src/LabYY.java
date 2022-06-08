import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldBackend;

public class LabYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = (int)(Math.random()*20+25);
		Display.openDefaultWorld();
		Display.setSize(N, N);
		Display.setSpeed(9);
		
		WorldBackend.getCurrent().putBeepers((int)(Math.random()*N+1), (int)(Math.random()*N+1), 1);
		findT[] robotArr = new findT[N];
		Thread[] thread = new Thread[N];
		for(int i = 0; i < N; ++i) {
			robotArr[i] = new findT(1, i+1, Display.EAST,0,N-1);
			thread[i] = new Thread(robotArr[i]);
			
		}
		for(int i = 0; i < N; ++i) {
			thread[i].start();
		}
	}

}
