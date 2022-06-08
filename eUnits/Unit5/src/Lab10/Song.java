//Name______________________________ Date_____________
package Lab10;

public class Song implements Comparable<Song> {
	// data fields
	private String myTitle;
	private int myMinutes, mySeconds;

	// constructors
	public Song(String toBeParsed) {
		myMinutes = Integer.parseInt(toBeParsed.substring(0, toBeParsed.indexOf(":")));
		mySeconds = Integer.parseInt(toBeParsed.substring(toBeParsed.indexOf(":") + 1, toBeParsed.indexOf(" ")));
		myTitle = toBeParsed.substring(toBeParsed.indexOf(" ") + 1, toBeParsed.length());
	}


	// accessors and modifiers
	public void setMinutes(int m) {
		myMinutes = m;
	}
	public void setSeconds(int s) {
		mySeconds = s;
	}
	public void setTitle(String s) {
		myTitle = s;
	}
	public int getMinutes() {
		return myMinutes;
	}
	public int getSeconds() {
		return mySeconds;
	}
	public String getTitle() {
		return myTitle;
	}
	// other methods: compareTo(), equals(), toString()

	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return (myMinutes*60 + mySeconds) - (o.getMinutes()*60 + o.getSeconds());
	}
	
	public boolean equals(Song s) {
		return compareTo(s) == 0;
	}
	
	public String toString() {
		return myMinutes + ":" + mySeconds + " " + myTitle;
	}
}