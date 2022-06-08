package Lab05;

public class Distance implements Comparable<Distance> {
	private int myfeet, myinches;

	public Distance() {
		myfeet = 0;
		myinches = 0;
	}

	public Distance(int ft, int in) {
		myfeet = ft;
		myinches = in;
	}

	public int getfeet() {
		return myfeet;
	}

	public int getinches() {
		return myinches;
	}

	@Override
	public int compareTo(Distance o) {
		int myTotal = myfeet * 12 + myinches; // access my data directly
		int oTotal = o.getfeet() * 12 + o.getinches(); // use w's get() methods
		return myTotal - oTotal; // return the difference in ounces
	}

	public boolean equals(Distance arg) {
		return compareTo(arg) == 0;
	}

	public String toString() {
		return myfeet + " feet. " + myinches + " inches.";
	}
}
