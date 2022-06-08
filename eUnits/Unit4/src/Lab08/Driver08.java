package Lab08;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Driver08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner infile = new Scanner(new File("src/Lab08/words.txt"));
		int size = infile.nextInt();
		String[] wordArr = new String[size];
		
		for(int i = 0; i < size; ++i) {
			wordArr[i] = infile.nextLine();
		}
		
		while(true) {
			String word = JOptionPane.showInputDialog("Word? (Type -1 to quit)");
			if(word.equals("-1")) {
				System.out.println("Good-bye");
				break;
			}
			for(int i = 0; i < size; ++i) {
				if(wordArr[i].equals(word)) {
					System.out.println("Yes, \"" + word + "\" is a word, #" + (i + 2));
					break;
				} 
				if(i == size - 1) {
					System.out.println("No, \"" + word + "\" is not a word.");
				}
			}
		}
		}catch(FileNotFoundException e){
			
		}
	}

}
