package Lab00;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner infile = null;
		try {
			infile = new Scanner(new File("src/Lab00/data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int numitems = infile.nextInt();
		double[] array = new double[numitems];
		for(int k = 0; k < numitems; k++)
		array[k] = infile.nextDouble();
		infile.close();
		int minPos, maxPos;
		minPos = findMin(array);
		maxPos = findMax(array);
		System.out.println("Minimum Value: " + array[minPos]);
		System.out.println("Maximum Value: " + array[maxPos]);
	}

	private static int findMax(double[] array) {
		// TODO Auto-generated method stub
		double max = array[0];
		int pos = 0;
		for(int i = 0; i < array.length; ++i) {
			if(array[i] > max) {
				max = array[i];
				pos = i;
			}
		}
		return pos;
	}

	private static int findMin(double[] array) {
		// TODO Auto-generated method stub
		double min = array[0];
		int pos = 0;
		for(int i = 0; i < array.length; ++i) {
			if(array[i] < min) {
				min = array[i];
				pos = i;
			}
		}
		return pos;
	}

}
