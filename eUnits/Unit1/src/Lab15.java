import edu.fcps.karel2.Display;

//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

    public class Lab15
   {
       public static void main(String[] args)
      {
    	 Display.setSpeed(8);
         Dancer weismuller = new BackAndForthDancer(2);
         Dancer fraser = new squareDancer(5);
         Dancer spitz = new ButterflyDancer(8);
         
         Thread t1 = new Thread( weismuller );
         Thread t2 = new Thread( fraser );
         Thread t3 = new Thread( spitz );
         
         t1.start();
         t2.start();
         t3.start();
         
      }
   }