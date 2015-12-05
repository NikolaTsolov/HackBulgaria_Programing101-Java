package week1Problems;

import java.util.Scanner;

public class CountOccurences {

	public static int count(String userInput, String word) {
		int result = 0;
		while (userInput.indexOf(word) != -1) {
			result += 1;
			userInput = userInput.replaceFirst(word, "");
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String userInput = sc.nextLine();
		String searchedWord = sc.nextLine();

		System.out.println(count(userInput, searchedWord));

		sc.close();
	}

}
