package Lab06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import Lab05.Distance;

public class Driver06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Comparable[] array = input("src/Lab06/data.txt");
		sort(array);
		output(array, "src/Lab06/output.txt");
	}
	
	public static Comparable[] input(String filename) throws Exception {
		Scanner infile = new Scanner(new File(filename));
		int numitems = infile.nextInt();
		Comparable[] array = new Comparable[numitems];
		
		for (int k = 0; k < numitems; k++) {
			array[k] = infile.nextLine();
		}
		infile.close();
		return array;
	}

	public static void output(Object[] array, String filename) throws Exception {
		System.setOut(new PrintStream(new FileOutputStream(filename)));
		for (int k = 0; k < array.length; k++)
			System.out.println(array[k]);
	}

	public static void sort(Comparable[] array) {
		int maxPos;
		for (int k = 0; k < array.length; k++) {
			maxPos = findMax(array, array.length - k);
			swap(array, maxPos, array.length - k - 1);
		}
	}

	public static int findMax(Comparable[] array, int upper) 
	{
		int index = 0;
		Comparable max = array[0];
		for(int i = 0; i < upper; ++i) {
			if(array[i].compareTo(max) > 0) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}

	public static void swap(Comparable[] array, int a, int b)
	{
		Comparable temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
