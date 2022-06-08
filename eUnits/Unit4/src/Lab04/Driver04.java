package Lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Driver04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner infile = null;
		try {
			String filename = JOptionPane.showInputDialog("Enter filename");
			infile = new Scanner(new File("src/Lab04/"+filename+".txt"));
			int size = infile.nextInt();
			double[] array = new double[size];
			double sum = 0, max = 0, min = 0;
			for(int i = 0; i < size; ++i) {
				array[i] = infile.nextDouble();
				sum += array[i];
				if(i == 0) {
					min = max = array[i];
				}
				min = (array[i] < min)? array[i] : min;
				max = (array[i] > max)? array[i] : max;
			}
			infile.close();
			System.out.println("Sum: " + sum);
			System.out.println("Avg: " + (sum / size));
			System.out.println("Min: "+ min);
			System.out.println("Max: " + max);
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error: File not found.");
			System.exit(0);
		}

	}

}
