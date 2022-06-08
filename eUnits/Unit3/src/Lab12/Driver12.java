//Name______________________________ Date_____________
package Lab12;

import javax.swing.JOptionPane;

public class Driver12 {
	public static void main(String[] args) {
		while (true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("How many rows? (-1 to quit)"));
			if (n == -1) {
				System.out.println("Bye-bye!");
				System.exit(0);
			}
			String message = "What type? (1-4)";
			message = message + "\n1. Standard";
			message = message + "\n2. Backward";
			message = message + "\n3. Pyramid";
			message = message + "\n4. Box with X";
			int type = Integer.parseInt(JOptionPane.showInputDialog(message));
			switch (type) {
			case 1:
				standard(n);
				break;
			case 2:
				backward(n);
				break;
			case 3:
				pyramid(n);
				break;
			case 4:
				box(n);
				break;
			default:
				System.out.println("Not a valid type.");
				break;
			}
			System.out.println();
		}
	}

	public static void standard(int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void backward(int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = 0; j < n - i; ++j) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void pyramid(int n) {
		for(int i = 1; i <= n; ++i) {
			for(int j = 0; j < n - i; ++j) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i - 1; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void box(int n) {
		for(int i = 1; i <= n; ++i) {
			//top & bottom
			if(i == 1 || i == n) {
				for(int j = 0; j < n; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			else {
				for(int j = 1; j <= n; ++j) {
					if(j == 1 || j == n) {
						System.out.print("*");
					}
					else {
						if(i == j || (i + j) == n + 1) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}

	}
}