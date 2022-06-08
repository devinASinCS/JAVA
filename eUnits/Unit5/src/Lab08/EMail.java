//Name______________________________ Date_____________
package Lab08;

public class EMail {
	private String myUserName;
	private String myHostName;
	private String myExtension;

	public EMail(String address) {
		myUserName = address.substring(0, address.indexOf("@"));
		myHostName = address.substring(address.indexOf("@") + 1, address.indexOf("."));
		myExtension = address.substring(address.indexOf(".") + 1);
	}

	public String getUserName() {
		return myUserName;
	}

	public String getHostName() {
		return myHostName;
	}

	public String getExtension() {
		return myExtension;
	}

	public String toString() {
		return myUserName + "@" + myHostName + "." + myExtension;
	}
}