package week1Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task38ZeroInsertion {

	public static ArrayList<Integer> makeArray(int number) {
		ArrayList<Integer> resultArray = new ArrayList<>();
		int digit = 0;
		while (number != 0) {
			digit = number % 10;
			resultArray.add(digit);
			number /= 10;
		}
		Collections.reverse(resultArray);

		return resultArray;
	}

	public static ArrayList<Integer> zeroInsert(int number) {
		ArrayList<Integer> list = new ArrayList<>(makeArray(number));
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) == list.get(i - 1)) {
				list.add(i, 0);
			} else {
				if ((list.get(i) + list.get(i - 1)) % 10 == 0) {
					list.add(i, 0);
				}
			}
		}
		return list;
	}

	public static void print(ArrayList<Integer> list) {
		for (Integer el : list) {
			System.out.print(el);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		while (number < 0) {
			System.err.println("Invalid input, try again");
			number = sc.nextInt();
		}
		print(zeroInsert(number));
		sc.close();
	}
}
