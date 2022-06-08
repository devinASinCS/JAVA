//Name______________________________ Date_____________
package Lab07;

public class Salesperson {
	// data fields
	private String myName;
	private int myCars, myTrucks;

	public Salesperson() {
		myName = "Empty";
		myCars = 0;
		myTrucks = 0;
	}
	
	public Salesperson(String name, int car, int truck) {
		myName = name;
		myCars = car;
		myTrucks = truck;
	}
	
	public void setName(String name) {
		myName = name;
	}
	
	public void setCars(int x) {
		myCars = x;
	}
	
	public void setTrucks(int x) {
		myTrucks = x;
	}
	
	public String getName() {
		return myName;
	}
	
	public int getCars() {
		return myCars;
	}
	
	public int getTrucks() {
		return myTrucks;
	}

	public String toString() {
		return myName + "\t" + myCars + "\t" + myTrucks + "\t" + (myCars + myTrucks);
	}
}