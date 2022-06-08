package Lab06;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Driver06{
	public static final int NUMITEMS = 10;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setOut(new PrintStream(new FileOutputStream("src/Lab06/output.txt")));
		Shape[] shapeArr = new Shape[NUMITEMS];
		for(int i = 0; i < NUMITEMS; ++i) {
			int op = (int) (Math.random() * 4);
			switch(op) {
			case 0:
				shapeArr[i] = new Circle(Math.random() * 500);
				break;
			case 1:
				shapeArr[i] = new Rectangle(Math.random() * 500, Math.random() * 500);
				break;
			case 2:
				shapeArr[i] = new Square(Math.random() * 500);
				break;
			case 3:
				shapeArr[i] = new Triangle((int)(Math.random() * 500));
				break;
			}
		}
		for(int i = 0; i < NUMITEMS; ++i) {
			System.out.println("area: " + shapeArr[i].findArea() + "\t\t" + shapeArr[i].toString());
		}
		
	}

}
