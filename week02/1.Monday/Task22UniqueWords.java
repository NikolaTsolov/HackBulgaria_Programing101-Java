import java.util.HashSet;
import java.util.Scanner;

public class Task22UniqueWords {

	public static int uniqueWordsCount(String[] arr) {
		HashSet<String> hs = new HashSet<String>();
		for (String item : arr) {
			hs.add(item);
		}
		return hs.size();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] inputArray = input.split(", ");
		
		System.out.println(uniqueWordsCount(inputArray));
		
		sc.close();
	}
}
