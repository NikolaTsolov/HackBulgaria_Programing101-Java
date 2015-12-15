package wednesday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RotateTheElemetsOfCollection {

	public static <T> void rotate(Collection<T> colleciton, int rotateStep) {
		List<T> helper = new ArrayList<>();
		helper.addAll(colleciton);
		if (rotateStep < 0) {
			while (rotateStep < 0) {
				helper.add(helper.size(), helper.get(0));
				helper.remove(0);
				rotateStep++;

			}
		}
		if (rotateStep > 0) {
			while (rotateStep > 0) {
				helper.add(0, helper.get(helper.size() - 1));
				rotateStep--;
				helper.remove(helper.size() - 1);
			}
		}
		for (T el : helper) {
			System.out.print(el + " ");
		}
	}

	public static void main(String[] args) {
//		List<String> input = new ArrayList<>();
		Set<String> input = new HashSet<>();
		input.add("one");
		input.add("two");
		input.add("three");
		input.add("four");
		input.add("five");
		input.add("six");
		input.add("seven");

		rotate(input, 1);
	}
}
