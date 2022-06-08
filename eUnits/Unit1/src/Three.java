import edu.fcps.Digit;

public class Three extends Digit {

	public Three(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_Off();
		segment7_On();
	}

}
