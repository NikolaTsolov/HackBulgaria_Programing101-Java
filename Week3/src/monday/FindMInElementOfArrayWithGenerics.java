package monday;

public class FindMInElementOfArrayWithGenerics {

	public static <T extends Comparable<T>> T min(T[] list) {
		T min = list[0];
		for (int i = 1; i < list.length; i++) {
			if (min.compareTo(list[i]) > 0) {
				min = list[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println(min(new String[]{"ivan", "a", "bb", "afaw"}));
	}
}
