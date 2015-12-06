package wednesday;

import java.util.Scanner;
import java.util.Stack;

public class CheckIfAnExpressionOfBracketsIsCorrect {

	public static boolean checkForBrackets(String input) {
		Stack<Character> helper = new Stack<>();

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == '(') {
				helper.push(input.charAt(index));
			} else {
				if (input.charAt(index) == ')') {
					if (helper.isEmpty()) {
						return false;
					} else {
						helper.pop();
					}
				}
			}
		}
		if (helper.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(checkForBrackets(input));

		sc.close();

	}

}
