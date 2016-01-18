package wednesday;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(5);
		myList.add(1);
		myList.add(2);
		myList.add(8);
		myList.add(0);
		
		FunnyArraySorter sorter = new FunnyArraySorter(0, myList);
		
		sorter.reverseSort();
		sorter.print();
	}

}
