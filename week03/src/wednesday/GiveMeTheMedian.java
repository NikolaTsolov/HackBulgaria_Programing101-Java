package wednesday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class GiveMeTheMedian implements Statistics {

	private ArrayList<Integer> input;
	private int sum;

	public GiveMeTheMedian() {
		input = new ArrayList<>();
		this.sum = 0;
	}
	@Override
	public int getMean() {
		return sum / this.input.size();
	}

	@Override
	public int getMedian() {
		Collections.sort(this.input);
		if (input.size() % 2 == 0) {
			return this.input.get(this.input.size() / 2);
		} else {
			return input.get((input.size() + 1) / 2);
		}

	}

	@Override
	public int getMode() {
		Map<Integer, Integer> mp = new TreeMap<>();
		for (Integer item : this.input) {
			if (mp.containsKey(item)) {
				mp.put(item, mp.get(item) + 1);
			} else {
				mp.put(item, 1);
			}
		}
		int maxOccurance = 1;
		int key = 0;
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (maxOccurance < entry.getValue()) {
				maxOccurance = entry.getValue();
				key = entry.getKey();
			}
		}
		return key;
	}

	@Override
	public int getRange() {
		Collections.sort(input);
		return input.get(input.size() - 1) - input.get(0);
	}

	@Override
	public void addItem(int number) {
		this.input.add(number);
		this.sum += number;
	}
	public static void main(String[] args) {
		GiveMeTheMedian list = new GiveMeTheMedian();

		list.addItem(13);
		list.addItem(18);
		list.addItem(13);
		list.addItem(14);
		list.addItem(13);
		list.addItem(16);
		list.addItem(14);
		list.addItem(21);
		list.addItem(13);

		System.out.println(list.getMean());
	}
}
