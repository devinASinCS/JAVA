package P1;

public class Chicken extends Animal implements Irun, Ijump{
	public Chicken(int foot, int height, float weight) {
		super(foot, height, weight);
	}
	
	public void show() {
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}�����C");
	}
	
	public void eat() {
		weight += 1.2; 
	}
	
	public void jump_go() {
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}�������b���D�C");
	}
	
	public void run_go() {
		System.out.println("�@����="+height+"cm, ��="+weight+"kg, "+foot+"�}�������b�]�B�C");
	}
}
