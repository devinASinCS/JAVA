	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
      
      public void workCorner() {
    	  int preBeepers = myBeepers;
    	  while(nextToABeeper()) {
    		  pickBeeper();
    		  ++myBeepers;
    	  }
    	  while(preBeepers > 0) {
    		  putBeeper();
    		  --preBeepers;
    		  --myBeepers;
    	  }

      }
      
      public void turnToTheRight() {
    	  turnLeft();
    	  turnLeft();
    	  turnLeft();
      }
      public void turnToTheNorth() {
    	  while(!facingNorth()) {
    		  turnLeft();
    	  }
      }
      
      public void moveOneBlock() {
    	  move();
      }
      
      public void run() {
    	  for(int i = 0; i < 7; ++i) {
    		  workCorner();
    		  moveOneBlock();
    	  }
    	  move();
      }
   }