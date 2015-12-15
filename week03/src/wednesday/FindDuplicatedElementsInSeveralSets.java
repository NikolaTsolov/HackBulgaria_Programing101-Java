package wednesday;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatedElementsInSeveralSets {

	public static <T> Set<T> setWithDuplicatingElements(Set<T>[] sets) {
		Set<T> resultSet = new HashSet<>();

		// finding the shortest set
		Set<T> smallestSet = sets[0];
		for (int i = 1; i < sets.length; i++) {
			if (sets[i].size() < smallestSet.size()) {
				smallestSet = sets[i];
			}
		}

		for (T item : smallestSet) {
			int index = 0;
			while (index < sets.length) {
				if (!sets[index].contains(item)) {
					break;
				}
				index++;
			}
			if (index == sets.length) {
				resultSet.add(item);
			}
		}
		return resultSet;
	}

	public static void main(String[] args) {
		Set<Integer> firstSet = new HashSet<>();
		firstSet.add(1);
		firstSet.add(2);
		firstSet.add(3);
		firstSet.add(4);
		firstSet.add(5);

		Set<Integer> secondSet = new HashSet<>();
		secondSet.add(4);
		secondSet.add(5);
		secondSet.add(6);

		Set<Integer> thirdSet = new HashSet<>();

		thirdSet.add(5);
		thirdSet.add(6);
		thirdSet.add(7);
		thirdSet.add(8);

		Set[] input = { firstSet, secondSet, thirdSet };

		System.out.println(setWithDuplicatingElements(input));
	}

}
