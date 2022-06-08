	//Name______________________________ Date_____________
package Lab07;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab06.TurtlePanel;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         
         
         PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
//         smidge.setColor(Color.BLUE);
//         smidge.setThickness(6);
//         smidge.drawShape();
//         
//         smidge = new PolygonTurtle(100, 5);
//         smidge.setColor(Color.BLUE);
//         smidge.setThickness(6);
//         smidge.drawShape();
//         
//         
//         smidge = new PolygonTurtle(500, 300, 90, 50, 3);
//         smidge.setColor(Color.BLUE);
//         smidge.setThickness(4);
//         smidge.drawShape();
//         
//         smidge.setSides(4);
//         smidge.drawShape();
//         
//         smidge.setSides(5);
//         smidge.drawShape();
//         
//         smidge.setSides(6);
//         smidge.drawShape();
//         
//         smidge.setSides(8);
//         smidge.drawShape();
//         
//         smidge.setSides(10);
//         smidge.drawShape();
//         
//         smidge = new PolygonTurtle(400, 500, 90, 50, 3);
//         smidge.setColor(Color.BLACK);
//         for(int i = 3; i < 10; ++i) {
//        	 smidge.drawShape(i);
//         }
         
         smidge = new PolygonTurtle(200, 500, 90, 50, 3);
         smidge.drawStar(11);
      }
   }