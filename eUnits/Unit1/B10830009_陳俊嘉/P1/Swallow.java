package P1;

public class Swallow extends Animal implements Ifly{
	public Swallow(int foot, int height, float weight) {
		super(foot, height, weight);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}���P�l�C");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		weight += 0.5;
	}

	public void fly_go() {
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}���P�l���b�����C");
	}
}
