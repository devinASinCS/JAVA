import edu.fcps.karel2.Display;

public class Lab04 {
	
	public static void takeTheField(Athlete arg){
		arg.move();
		arg.move();
		arg.move();
		arg.move();
		arg.turnRight();
		arg.move();
		arg.move();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/arena.map");
		Athlete a = new Athlete();
		Athlete b = new Athlete();
		Athlete c = new Athlete();
		Athlete d = new Athlete();
		Athlete e = new Athlete();
		Athlete f = new Athlete();
		Athlete coach = new Athlete(2,7,Display.EAST,0);
		
		takeTheField(a);
		a.move();
		a.move();
		a.move();
		a.turnLeft();
		a.move();
		a.move();
		a.turnAround();
		
		takeTheField(b);
		b.move();
		b.turnLeft();
		b.move();
		b.turnAround();
		
		takeTheField(c);
		c.move();
		c.move();
		c.move();
		c.move();
		c.move();
		c.turnLeft();
		c.move();
		c.turnAround();
		
		takeTheField(d);
		d.move();
		d.move();
		d.move();
		d.move();
		d.turnRight();
		
		takeTheField(e);
		e.move();
		e.move();
		e.move();
		e.turnRight();
		
		takeTheField(f);
		f.move();
		f.move();
		f.turnRight();

	}

}
