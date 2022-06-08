
public class SteepleChaseRacer extends Racer {

	public SteepleChaseRacer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SteepleChaseRacer(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}

	public void jumpRight() {
		turnLeft();
		int n = 0;
		while(!rightIsClear()) {
			move();
			++n;
		}
		turnRight();
		move();
		turnRight();
		for(int i = 0; i < n; ++i) {
			move();
		}
		turnLeft();
	}
}
