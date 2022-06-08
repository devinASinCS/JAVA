package P1;

public class Chicken extends Animal implements Irun, Ijump{
	public Chicken(int foot, int height, float weight) {
		super(foot, height, weight);
	}
	
	public void show() {
		System.out.println("一隻高="+height+"cm, 重="+weight+"kg, "+foot+"腳的雞。");
	}
	
	public void eat() {
		weight += 1.2; 
	}
	
	public void jump_go() {
		System.out.println("一隻高="+height+"cm, 重="+weight+"kg, "+foot+"腳的雞正在跳躍。");
	}
	
	public void run_go() {
		System.out.println("一隻高="+height+"cm, 重="+weight+"kg, "+foot+"腳的雞正在跑步。");
	}
}
