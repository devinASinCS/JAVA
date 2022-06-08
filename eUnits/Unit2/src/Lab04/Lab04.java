package Lab04;

import javax.swing.JFrame;

import edu.fcps.Bucket;

public class Lab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Buckets");
		frame.setSize(600, 400);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BucketPanel());
		frame.setVisible(true);
		Bucket.setSpeed(5);
		Bucket.useTotal(false);
		Bucket five = new Bucket(5);
		Bucket three = new Bucket(3);
		// implement the algorithm here
		five.fill();
		five.pourInto(three);
		three.spill();
		five.pourInto(three);
		five.fill();
		five.pourInto(three);
	}
}
