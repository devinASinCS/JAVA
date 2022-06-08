package Lab17;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Panel17 extends JPanel {
	private BumperPanel panel;
	private JButton stop, run;
	private boolean running = true;
	private Timer timer;
	private JSlider slider;
	
	public Panel17() {
		setLayout(new BorderLayout());

		panel = new BumperPanel();
		
		add(panel, BorderLayout.CENTER);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,1));
		add(p, BorderLayout.SOUTH);
		
		JPanel bottons = new JPanel();
		bottons.setLayout(new FlowLayout());
		p.add(bottons);
		
		JButton random = new JButton("Randomize");
		random.addActionListener(new randomizeListener());
		bottons.add(random);
		
		stop = new JButton("Step");
		stop.addActionListener(new stepButtonListener());
		stop.setEnabled(false);
		bottons.add(stop);
		
		run = new JButton("Pause Animation");
		run.addActionListener(new runPauseListener());
		bottons.add(run);
		
		JLabel label = new JLabel("Change the slider below to adapt the delay.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		p.add(label);
		
		slider = new JSlider();
		p.add(slider);
		
		Timer sliderTimer = new Timer(5, new sliderListener());
		sliderTimer.start();
		
		timer = new Timer(50, new timeListener());
		timer.start();
	}
	
	
	private class randomizeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.jumpAll();
		}
		
	}
	private class stepButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.stepAnimation();
		}
		
	}
	private class runPauseListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			running = !running;
			if(running) {
				run.setText("Pause Animation");
				stop.setEnabled(false);
				timer.start();
			}else {
				run.setText("Run Animation");
				stop.setEnabled(true);
				timer.stop();
			}
			
		}
		
	}
	
	private class sliderListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timer.setDelay(slider.getValue());
			
		}
		
	}
	private class timeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.stepAnimation();
		}
		
	}
	
}
