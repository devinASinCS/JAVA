//Name______________________________ Date_____________
package Lab01;

import java.io.*;

public class Driver01 {
	public static void main(String[] args) {
		// input
		double[] myArray = { 2.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2 };

		// sort the array
		int maxIndex = 0;
		double temp = myArray[0];
		
		for(int i = 0; i < myArray.length; ++i) {
			maxIndex = 0;
			temp = myArray[0];
			//find max
			for(int j = 0; j < myArray.length - i; ++j) {
				if(myArray[j] > temp) {
					temp = myArray[j];
					maxIndex = j;
				}
			}
			//swap
			myArray[maxIndex] = myArray[myArray.length - i - 1];
			myArray[myArray.length - i - 1] = temp;
		}

		// output
		for(int i = 0; i < myArray.length; ++i) {
			System.out.print(myArray[i] + ", ");
		}
	}
}