package P1;

public abstract class Animal {
	public int foot, height;
	public double weight;
	
	public Animal(int foot, int height, float weight) {
		this.foot = foot;
		this.height = height;
		this.weight = weight;
	}
	
	public abstract void show();
	
	public abstract void eat();
}
