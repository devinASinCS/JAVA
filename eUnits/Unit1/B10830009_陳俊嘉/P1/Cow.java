package P1;

public class Cow extends Animal implements Irun{
	public Cow(int foot, int height, float weight) {
		super(foot, height, weight);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}�����C");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		weight += 10;
	}

	public void run_go() {
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}�������b�]�B�C");
	}
}
