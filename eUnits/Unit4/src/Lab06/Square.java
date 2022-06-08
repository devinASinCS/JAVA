package Lab06;

public class Square extends Rectangle {

	public Square(double e) {
		super(e, e);

	}

	public void setSide(double s) {
		super.setBase(s);
		super.setHeight(s);
	}
	
	public double getSide() {
		return super.getBase();
	}

}
