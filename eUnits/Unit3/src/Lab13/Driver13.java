package Lab13;

import javax.swing.JOptionPane;

public class Driver13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int first = Integer.parseInt(JOptionPane.showInputDialog("First number? (-1 to quit)"));
			if (first == -1) {
				System.exit(0);
			}
			int second = Integer.parseInt(JOptionPane.showInputDialog("Second number?"));
			
			System.out.println("loop " + necklace(first, second) + " times");
			
		}
	}
	
	public static int necklace(int first, int second) {
		int a, b, c;
		a = first;
		b = second;
		int times = 0;
		do{
			c = (a + b) % 10;
			a = b;
			b = c;
			++times;
		}while(!(a == first && b == second));
		return times;
	}

}
