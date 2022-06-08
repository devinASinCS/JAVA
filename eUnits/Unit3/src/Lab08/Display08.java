//Name______________________________ Date_____________
package Lab08;

import javax.swing.*;
import java.awt.*;

public class Display08 extends JPanel {
	private JLabel label;
	private JTextField box1, box2, box3;

	public Display08() {
		setLayout(new GridLayout(4, 2,5,5));

		add(new JLabel("Terms:", SwingConstants.RIGHT));
		box1 = new JTextField("", 5);
		box1.setHorizontalAlignment(SwingConstants.LEFT);
		add(box1);

		add(new JLabel("First:", SwingConstants.RIGHT));
		box2 = new JTextField("", 5);
		box2.setHorizontalAlignment(SwingConstants.LEFT);
		add(box2);

		add(new JLabel("Ratio:", SwingConstants.RIGHT));
		box3 = new JTextField("", 5);
		box3.setHorizontalAlignment(SwingConstants.LEFT);
		add(box3);

		add(new JLabel("Sum:", SwingConstants.RIGHT));
		label = new JLabel("");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setForeground(Color.blue);
		add(label);
	}

	public void sumFinite() {

		int a = Integer.parseInt(box2.getText());
		double r = Double.parseDouble(box3.getText());
		int n = Integer.parseInt(box1.getText());
		float ans = (float) ((a * (1 - Math.pow(r, n))) / (1 - r));
		label.setText("" + ans);
		
	}

	public void sumInfinite() {

		if(Double.parseDouble(box3.getText()) < 1 && Double.parseDouble(box3.getText()) > -1) {
			label.setText("" + (Integer.parseInt(box2.getText()) / (1 - Double.parseDouble(box3.getText()))));
		}else {
			label.setText("NONE");
		}

	}
}