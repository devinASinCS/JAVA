package Lab03;

public class Driver03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109 };
		print(array);
		scramble(array);
		print(array);
		sort(array);
		print(array);

	}

	private static void sort(int[] array) {
		// TODO Auto-generated method stub
		int maxPos;
		for (int k = 0; k < array.length; k++) {
			maxPos = findMax(array, array.length - k - 1);
			swap(array, maxPos, array.length - k - 1);
		}
	}

	public static int findMax(int[] array, int upper) // what does "upper" do???
	{
		int index = 0;
		int max = array[0];
		for(int i = 0; i <= upper; ++i) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}

	public static void swap(int[] array, int a, int b)// what are "a" and "b" for???
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	private static void scramble(int[] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i < (int)(Math.random() * 10 + 5); ++i) {
			swap(array, (int)(Math.random() * array.length), (int)(Math.random() * array.length));
		}
	}

	private static void print(int[] array) {
		// TODO Auto-generated method stub
		System.out.print(array[0]);
		for (int k = 1; k < array.length; k++) {
			System.out.print(", " + array[k]);
		}
		System.out.println();
	}

}
