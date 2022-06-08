package Lab06;

public class Triangle extends Shape {
	private double mySide;
	public Triangle(int i) {
		// TODO Auto-generated constructor stub
		this.mySide = i;
	}
	
	public void setSide(double s) {
		mySide = s;
	}
	
	public double getSide() {
		return mySide;
	}
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return mySide * Math.sqrt(Math.pow(mySide, 2) - Math.pow(mySide / 2, 2)) / 2;
	}
	public double findPerimeter() {
		return 3 * mySide;
	}
}
