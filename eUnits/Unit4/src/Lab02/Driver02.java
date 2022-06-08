package Lab02;

import java.util.Scanner;

public class Driver02 {
	public static final int NUMITEMS = 15;

	public static void main(String[] args) {

		double[] F = new double[NUMITEMS];
		double[] C = new double[NUMITEMS];
		Scanner keyboard = new Scanner(System.in);
			
		for (int x = 0; x < NUMITEMS; x++) {
			System.out.print("#" + (x + 1) + ":  ");
			F[x] = keyboard.nextDouble();
			C[x] = (F[x] - 32) * 5d / 9d;
		}
		System.out.println("Fahrenheit\t| Celsius");
		System.out.println("----------------|----------------");
		for(int i = 0; i < NUMITEMS; ++i) {
			System.out.println(F[i] + "\t| " + C[i]);
		}
	}
}