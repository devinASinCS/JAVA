package Lab06;

public class Rectangle extends Shape {
	private double myBase, myHeight;
	public Rectangle(double d, double e) {
		// TODO Auto-generated constructor stub
		myBase = d;
		myHeight = e;
	}

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return myBase * myHeight;
	}

	public double getBase() {
		// TODO Auto-generated method stub
		return myBase;
	}
	
	public void setBase(double x) {
		myBase = x;
	}

	public double getHeight() {
		return myHeight;
	}
	
	public void setHeight(double x) {
		myHeight = x;
	}

	public double findPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (myHeight + myBase);
	}

	public double findDiagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(myBase, 2) + Math.pow(myHeight, 2));
	}
}
