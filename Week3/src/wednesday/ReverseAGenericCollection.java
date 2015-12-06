package wednesday;

import java.util.*;

public class ReverseAGenericCollection {

	public static <T> Collection<T> reverse(Collection<T> collection) {
		Stack<T> helper = new Stack<>();
		helper.addAll(collection);
		while (!helper.isEmpty()) {
			System.out.print(helper.pop());
		}
		collection.clear();
		collection.addAll(helper);
		
		return collection;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}
}
