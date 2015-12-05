package week1Problems;

import java.util.Scanner;

public class TaskIsThisNumberPalindrome {
	
	public static boolean isPalindrome(int input){
		int resultNumber = 0;
		int saveInputNumber = input;
		int helper = 0;
		while(saveInputNumber != 0){
			helper = saveInputNumber % 10;
			resultNumber*=10;
			resultNumber = resultNumber + helper;
			saveInputNumber/=10;
			helper = 0;
		}
		if(input == resultNumber){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(isPalindrome(number));
		
		sc.close();
	}

}
