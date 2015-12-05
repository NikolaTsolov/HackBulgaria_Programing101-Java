package week1Problems;

import java.util.Scanner;

public class SumAllNumbers {
	
	public static int sumOfNumbers(String input){
		int sum = 0;
		String newString = input.replaceAll("[a-zA-Z]+", "");
		char[] helper = newString.toCharArray();
		for(int i = 0; i < newString.length();i++){
			sum = sum + Character.getNumericValue(helper[i]);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(sumOfNumbers(input));
		sc.close();
	}
}
