
public class BoxTopRacer extends Racer {

	public BoxTopRacer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoxTopRacer(int y) {
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
		while(!rightIsClear()) {
			move();
		}
		turnRight();
		for(int i = 0; i < n; ++i) {
			move();
		}
		turnLeft();
	}
}
