package friday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return o1.compareTo(o2);
	}
}

public class SortStudents {

	public static ArrayList<Students> sort(ArrayList<Students> input) {

		MyComparator c = new MyComparator();

		Collections.sort(input, c);

		return input;
	}

	public static void main(String[] args) {
		Students first = new Students("ivan", 6);
		Students second = new Students("pesho", 3);
		Students third = new Students("gosho", 5);
		Students fourth = new Students("misho", 7);
		Students fifth = new Students("ico", 6);

		ArrayList<Students> list = new ArrayList<>();
		list.add(first);
		list.add(second);
		list.add(third);
		list.add(fourth);
		list.add(fifth);

		ArrayList<Students> result = new ArrayList<>();
		result = sort(list);

		for (Students item : result) {
			System.out.println(item.getName() + ": " + item.getGrade());
		}

	}
}
