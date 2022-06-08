//Name______________________________ Date_____________
package Lab10;

import java.io.*; //the File class
import java.util.*; //the Scanner class
import javax.swing.JOptionPane;

public class Driver10 {
	public static void main(String[] args) {
		Song[] songList = input();
		int totalTime = calcTime(songList);
		int longestSong = searchLongestSong(songList);
		display(songList, totalTime, longestSong);
		System.exit(0);
	}

	public static Song[] input() {
		Scanner infile = null;
		String filename = JOptionPane.showInputDialog("What file?");
		try {
			infile = new Scanner(new File("src/Lab10/"+filename+".txt"));
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "The file could not be found.");
			System.exit(0);
		}
		int numitems = infile.nextInt();
		Song[] array = new Song[numitems];
		System.out.println(infile.nextLine());
		for (int k = 0; k < numitems; k++) {
			array[k] = new Song(infile.nextLine());
		}
		infile.close();
		return array;
	}

	public static int calcTime(Song[] songs) {
		int sec = 0;
		for(int i = 0; i < songs.length; ++i) {
			sec += songs[i].getMinutes() * 60 + songs[i].getSeconds();
		}
		return sec;
	}

	public static int searchLongestSong(Comparable[] songs) {
		Comparable max = songs[0];
		int index = 0;
		for(int i = 0; i < songs.length; ++i) {
			if(songs[i].compareTo(max) > 0) {
				index = i;
				max = songs[i];
			}
		}
		return index;
	}

	public static void display(Song[] array, int total, int longestSong) {
		System.out.println("Total Time: " + total/60 + "' " + total%60 + "\"");
		System.out.println("Longest Song: " + array[longestSong].getTitle() + " (" + array[longestSong].getMinutes()
				+ "' " + array[longestSong].getSeconds() + "\")");
	}
}