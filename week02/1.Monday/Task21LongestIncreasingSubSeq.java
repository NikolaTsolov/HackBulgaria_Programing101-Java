
public class Task21LongestIncreasingSubSeq {

	public static int maxIncreasingConsecutive(int[] input) {
		int max = 0;
		int counter = 1;

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] <= input[i + 1]) {
				counter++;
			} else {
				if (max < counter) {
					max = counter;
				}
				counter = 1;
			}
		}
		if (max < counter) {
			max = counter;
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5 };

		System.out.println(maxIncreasingConsecutive(arr));
	}
}
