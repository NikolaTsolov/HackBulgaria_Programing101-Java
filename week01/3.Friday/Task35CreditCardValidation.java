package week1Problems;

import java.util.Scanner;

public class Task35CreditCardValidation {

	public static boolean isCreditCardValid(String number) {
		if (number.length() % 2 == 0) {
			return false;
		}

		/*
		 * from int to char is not working StringBuilder sb = new
		 * StringBuilder(number);
		 * 
		 * int sum = 0; int helper= 0;
		 * 
		 * for(int index = sb.length() - 2; index >= 0; index-=2){ helper =
		 * Character.getNumericValue(sb.charAt(index)) * 2; sb.setCharAt(index,
		 * (char)(helper + '0')); } for(int index = 0; index <
		 * sb.length();index++){ sum = sum +
		 * Character.getNumericValue(sb.charAt(index)); } if(sum % 10 == 0){
		 * return true; }
		 * 
		 * return false;
		 */

		char[] toChar = new char[number.length()];
		toChar = number.toCharArray();
		int[] helper = new int[number.length()];
		for (int i = 0; i < helper.length; i++) {
			helper[i] = Character.getNumericValue(toChar[i]);
		}
		for (int i = helper.length - 2; i >= 0; i -= 2) {
			helper[i] = helper[i] * 2;
		}
		int sum = 0;
		for (int i = 0; i < helper.length; i++) {
			sum = sum + helper[i];
		}
		if (sum % 10 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(isCreditCardValid(input));

		sc.close();
	}

}
