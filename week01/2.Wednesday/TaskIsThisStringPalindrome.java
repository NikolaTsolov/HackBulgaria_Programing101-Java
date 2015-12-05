package week1Problems;

import java.util.Scanner;

public class TaskIsThisStringPalindrome {
	
	public static String reverseMe(String input){
		String res = new StringBuilder(input).reverse().toString();
		return res;
	}
	
	public static boolean isPalindrome(String input){
		if(input.equals(reverseMe(input))){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(isPalindrome(input));
		
		sc.close();
	}

}
