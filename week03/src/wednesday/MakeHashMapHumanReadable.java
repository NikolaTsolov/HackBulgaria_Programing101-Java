package wednesday;

import java.util.HashMap;
import java.util.Map.Entry;

public class MakeHashMapHumanReadable {

	public static String makeHumanReadable(HashMap<? extends Object, ? extends Object> input) {
		StringBuilder result = new StringBuilder();
		for (Entry<? extends Object, ? extends Object> entry : input.entrySet()) {
			result.append(entry.getKey());
			result.append(':');
			result.append(entry.getValue());
			System.out.println(result);
			result.delete(0, result.length());
		}
		return result.toString();
	}

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<>();
		myMap.put("ivan", 10);
		myMap.put("pesho", 10);
		myMap.put("gosho", 4);
		myMap.put("misho", 1);
		myMap.put("rado", 8);

		System.out.println(makeHumanReadable(myMap));
	}

}
