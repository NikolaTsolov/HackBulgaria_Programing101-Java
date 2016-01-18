package wednesday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunnyArraySorter {
	private int pivot;
	List<Integer> array = new ArrayList<Integer>();

	public FunnyArraySorter(int pivot, List<Integer> inputList) {
		this.pivot = pivot;
		this.array.addAll(inputList);
	}

	public void reverseSort() {
		Collections.sort(array, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return -(o1.compareTo(o2));
			}
		});
	}

	public int getPivot() {
		return pivot;
	}

	public void print() {
		for (int el : array) {
			System.out.println(el);
		}
	}

	public void pivotSubstracitonSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 - pivot > o2) {
					return 1;
				} else {
					return 0;
				}
			}	
		});
	}

}