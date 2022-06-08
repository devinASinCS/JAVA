//Name______________________________ Date_____________
package Lab02;

import java.io.*;
import java.util.Scanner;

public class Driver02 {
	public static void main(String[] args) throws Exception {
		double[] array = input("src/Lab00/data.txt");
		sort(array);
		output(array, "src/Lab02/output.txt");
	}

	public static double[] input(String filename) throws Exception {
		Scanner file = new Scanner(new File(filename));
		int size = file.nextInt();
		double[] array = new double[size];
		for(int i = 0; i < size; ++i) {
			array[i] = file.nextDouble();
		}
		file.close();
		return array;
	}

	public static void sort(double[] array) {
		int maxPos;
		for (int k = 0; k < array.length; k++) {
			maxPos = findMax(array, array.length - k - 1);
			swap(array, maxPos, array.length - k - 1);
		}
	}

	public static int findMax(double[] array, int upper) // what does "upper" do???
	{
		int index = 0;
		double max = array[0];
		for(int i = 0; i <= upper; ++i) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}

	public static void swap(double[] array, int a, int b)// what are "a" and "b" for???
	{
		double temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void output(double[] array, String filename) throws Exception {
		System.setOut(new PrintStream(new FileOutputStream(filename)));
		for (int k = 0; k < array.length; k++)
			System.out.println(array[k]);
	}
}