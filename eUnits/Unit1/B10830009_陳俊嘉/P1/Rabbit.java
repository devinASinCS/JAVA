package P1;

public class Rabbit extends Animal implements Ijump{
	public Rabbit(int foot, int height, float weight) {
		super(foot, height, weight);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}���ߤl�C");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		weight += 1.5;
	}

	public void jump_go() {
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}���ߤl���b���D�C");
	}
	
}
