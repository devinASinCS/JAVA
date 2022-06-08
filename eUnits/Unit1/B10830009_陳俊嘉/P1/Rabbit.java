package P1;

public class Rabbit extends Animal implements Ijump{
	public Rabbit(int foot, int height, float weight) {
		super(foot, height, weight);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("一隻高="+height+"cm, 重="+weight+"kg, "+foot+"腳的兔子。");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		weight += 1.5;
	}

	public void jump_go() {
		System.out.println("一隻高="+height+"cm, 重="+weight+"kg, "+foot+"腳的兔子正在跳躍。");
	}
	
}
