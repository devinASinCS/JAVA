package Lab10;
//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display10 extends JPanel
   {
      private JLabel[] bits;
      public Display10()
      {
         setLayout(new GridLayout(1, 8));
         bits = new JLabel[8];
         for(int x = 0; x < bits.length; x++)
         {
            bits[x] = new JLabel("", SwingConstants.CENTER);
            bits[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(bits[x]);
         }
         randomize();
      }
      public void randomize()
      {
         	for(int i = 0; i < bits.length; ++i) {
         		bits[i].setText("" + (int)(Math.random() * 2));
         	}
      }
      public void reverse()
      {
           	String temp;
           	for(int i = 0; i < bits.length / 2; ++i) {
           		temp = bits[i].getText();
           		bits[i].setText(bits[bits.length - i - 1].getText());
           		bits[bits.length - i - 1].setText(temp);
           	}
      }
      public void shift()
      {
           	for(int i = 0; i < bits.length - 1; ++i) {
           		bits[i].setText(bits[i+1].getText());
           	}
           	bits[7].setText("0");
      }
      public void rotate()
      {
           	String temp = bits[0].getText();
           	for(int i = 0; i < bits.length - 1; ++i) {
           		bits[i].setText(bits[i+1].getText());
           	}
           	bits[7].setText(temp);
      }
   }