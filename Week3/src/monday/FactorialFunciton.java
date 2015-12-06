package monday;

import java.util.Scanner;

public class FactorialFunciton {

	public static <T extends Number> Number fact(T number) {
		if (number.doubleValue() == 1) {
			return 1;
		} else {
			return number.doubleValue() * (fact(number.doubleValue() - 1)).doubleValue();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(fact(number));

		sc.close();
	}

}
