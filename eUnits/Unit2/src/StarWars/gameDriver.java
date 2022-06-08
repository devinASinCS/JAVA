package StarWars;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class gameDriver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("star war");
		frame.setSize(500, 700);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new gamePanel());
		frame.setVisible(true);

//		File file = new File(Game2.class.getResourceAsStream("music.wav"));
		URL url;

		try {
			url = gameDriver.class.getResource("music.wav");
			AudioInputStream audio = AudioSystem.getAudioInputStream(url);

			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			while (true) {
				clip.start();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
