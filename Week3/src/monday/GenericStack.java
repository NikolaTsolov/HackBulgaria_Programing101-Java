package monday;

import java.util.ArrayList;
import java.util.List;

interface infStack<T> {

	void pop();

	void push(T element);

	int length();

	boolean isEmpty();

	void clear();
}

public class GenericStack<T> implements infStack<T> {
	private List<T> list = new ArrayList<>();

	public GenericStack() {
	};

	@Override
	public int length() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		if (this.length() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public void push(T element) {
		if (list.contains(element)) {
			System.err.printf("Element %d you are trying to push is already in the stac!", element);
		} else {
			list.add(0, element);
		}
	}

	@Override
	public void pop() {
		list.remove(0);
	}

	public void print() {
		for (Object el : list) {
			System.out.println(el);
		}
	}

	public static void main(String[] args) {
		GenericStack<String> s = new GenericStack<>();
		s.push("ivan");

		s.print();
	}
}
