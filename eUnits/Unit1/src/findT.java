import edu.fcps.karel2.Robot;

public class findT extends Robot implements Runnable{
	int step;
	public findT(int x, int y, int dir, int num, int N) {
		super(x, y, dir, num);
		this.step = N;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int taken = 0;
		for(int i = 0; i < step; ++i) {
			if(nextToABeeper()) {
				pickBeeper();
				break;
			}else {
				move();
				++taken;
			}
		}
		turnLeft();
		turnLeft();
		for(int i = 0; i < taken; ++i) {
			move();
		}
	}

}
