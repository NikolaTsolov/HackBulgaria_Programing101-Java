public class Task20LongestSubSeq {

	public static int maxEqualConsecutive(int[] items) {
		int max = 0;
		int counter = 1;
		for (int i = 0; i < items.length - 1; i++) {
			if (items[i] == items[i + 1]) {
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
		int[] input = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6 };
		System.out.println(maxEqualConsecutive(input));
	}
}