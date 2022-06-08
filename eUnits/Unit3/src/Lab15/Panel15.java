package Lab15;
//Name: ________________________  Date: __________________

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel15 extends JPanel {
	public Panel15() {
		/*****************************************************
		 * Panel15 has a border layout. The center has a textArea with lineWrap turned
		 * on. The south is formatted in a flowLayout and has a NamePanel, a StylePanel,
		 * and a SizePanel.
		 *******************************************************/
		setLayout(new BorderLayout());
		
		JTextArea text = new JTextArea();
		add(text, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		add(panel, BorderLayout.SOUTH);
		
		panel.add(new NamePanel(text));
		panel.add(new StylePanel(text));
		panel.add(new SizePanel(text));
	}
}