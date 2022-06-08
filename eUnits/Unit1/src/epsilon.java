import edu.fcps.Digit;

public class epsilon extends Digit_test implements Runnable{

	public epsilon(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		segment1_On();
		segment2_Off();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_On();
		segment7_On();
		explode();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
