  	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab08
   {
       public static void race(Racer arg)
      {
         while(!arg.nextToABeeper())
         {
            if(arg.frontIsClear())
            {
               arg.move();
            }
            else
            {
               arg.jumpRight();
            }
         }
      }
       public static void main(String[] args) 
      {
    	 String[] fileNameOption = {"hurdle1", "hurdle2", "hurdle3", "steeple1", "steeple2", "steeple3", "boxtop1", "boxtop2","boxtop3"};
         String filename = (String)JOptionPane.showInputDialog(null,"What robot world?",null,JOptionPane.QUESTION_MESSAGE,null,fileNameOption,"hurdle1");
         String[] typeOption = {"Racer", "SteepleChaseRacer", "BoxTopRacer"};
         String type = (String)JOptionPane.showInputDialog(null,"What type of racer?",null,JOptionPane.QUESTION_MESSAGE,null,typeOption,"Racer");
      
       Display.openWorld("maps/"+filename+".map");
         Display.setSize(18, 16);
         Display.setSpeed(10);
      
         if(type.equals("Racer"))
         {
            race( new Racer(1) );
         }
         else if(type.equals("SteepleChaseRacer"))
         {
            race( new SteepleChaseRacer(1) );
         }
         else if(type.equals("BoxTopRacer"))
         {
            race( new BoxTopRacer(1) );
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
      }
   }