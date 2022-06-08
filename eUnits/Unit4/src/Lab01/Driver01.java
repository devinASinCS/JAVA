package Lab01;

import java.util.Scanner;

public class Driver01 {
	public static final int NUMITEMS = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = new double[NUMITEMS];
		double sum = 0;
		double min = 0, max = 0;
		Scanner keyboard = new Scanner(System.in);
		for (int x = 0; x < NUMITEMS; x++) {
			System.out.print("#" + (x + 1) + ":  ");
			array[x] = keyboard.nextDouble();
			sum += array[x];
			if (x == 0) {
				min = max = array[x];
			} else {
				min = (array[x] < min) ? array[x] : min;
				max = (array[x] > max) ? array[x] : max;
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + (sum / NUMITEMS));
		System.out.println("Min: "+ min);
		System.out.println("Max: " + max);
	}

}
