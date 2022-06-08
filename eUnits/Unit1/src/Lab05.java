import edu.fcps.karel2.Display;

public class Lab05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/shuttle.map");
		Display.setSpeed(10);
		Racer top = new Racer(7);
		Racer mid = new Racer(4);
		Racer bot = new Racer(1);
		
		bot.shuttle(2, 7);
		bot.shuttle(4, 5);
		bot.shuttle(6, 3);
		mid.shuttle(2, 7);
		mid.shuttle(4, 5);
		mid.shuttle(6, 3);
		top.shuttle(2, 7);
		top.shuttle(4, 5);
		top.shuttle(6, 3);
	}

}
