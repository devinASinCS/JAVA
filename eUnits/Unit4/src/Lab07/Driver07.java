package Lab07;

//Name______________________________ Date_____________
public class Driver07 {
	public static final int TRIALS = 100;

	public static void main(String[] args) {
		Dice d = new Dice();
		int count = 0;
		do {
			d.roll();
			count = count + 1;
		} while (d.total() != 12);
		System.out.println("It took " + count + " rolls to get boxcars.");
		
		int[] array = new int[12];
		count = 0;
		do {
			d.roll();
			++count;
		} while (!(d.total() == 2 && d.doubles()));
		System.out.println("It took " + count + " rolls to get doubles: {1, 1}");
		int sum = 0;
		for (int i = 0; i < TRIALS; ++i) {
			d.roll();
			array[d.total() - 1]++;
			if (d.doubles()) {
				++sum;
			}
		}
		for (int i = 2; i <= 12; ++i) {
			System.out.println(i + "'s:\t" + array[i-1]);
		}
		System.out.println("Number of doubles in 100 rolls: " + sum);
	}
}
	/******
	 It took 35 rolls to get boxcars.
    It took 4 rolls to get doubles: {1, 1}
    2's:  6
    3's:  6
    4's:  5
    5's:  10
    6's:  12
    7's:  20
    8's:  17
    9's:  6
    10's:  10
    11's:  4
    12's:  4
    Number of doubles in 100 rolls: 18
	 ********/