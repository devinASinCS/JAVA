package Lab20;

import java.awt.Color;

public class Prize extends Spot {
	public Prize() {
		super();
	}
	public Prize(int x, int y, int r, Color c) {
		// TODO Auto-generated constructor stub
		super(x, y, r, c);
	}
	
	public void lightUp() {
		setColor(Color.YELLOW);
	}

}
