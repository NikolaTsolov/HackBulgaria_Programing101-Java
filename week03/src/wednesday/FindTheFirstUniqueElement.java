package wednesday;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class FindTheFirstUniqueElement {

	public static <T> T getFirstUniqueElement(Collection<T> collection) {

		Queue<T> helper = new LinkedList<>();
		for (T el : collection) {
			helper.add(el);
		}
		T temp = null;
		while (!helper.isEmpty()) {
			temp = helper.poll();
			if (!helper.contains(temp)) {
				break;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Collection<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 1);
		System.out.println(getFirstUniqueElement(ints));
	}

}
