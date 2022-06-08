package Lab04;

import javax.swing.JFrame;

import edu.fcps.Bucket;

public class Lab04a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Buckets");
		frame.setSize(600, 400);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BucketPanel());
		frame.setVisible(true);
		Bucket.setSpeed(1);
		Bucket.useTotal(true);
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
