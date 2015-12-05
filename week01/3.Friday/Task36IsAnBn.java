package week1Problems;

import java.util.Scanner;

public class Task36IsAnBn {

	public static boolean isAnBn(String word) {
		if (word.equals("")) {
			return true;
		}
		String[] helper = new String[2];
		if (word.length() % 2 == 0) {
			helper[0] = word.substring(0, word.length() / 2);
			helper[1] = word.substring(word.length() / 2, word.length());
		} else {
			helper[0] = word.substring(0, word.length() / 2 + 1);
			helper[1] = word.substring(word.length() / 2 + 1, word.length());
		}

		if (helper[0].charAt(0) != 'a') {
			return false;
		}

		if (helper[0].contains("a") && helper[1].contains("a")) {
			return false;
		} else {
			if (helper[0].contains("b") && helper[1].contains("b")) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		System.out.println(isAnBn(input));

		sc.close();
	}

}
