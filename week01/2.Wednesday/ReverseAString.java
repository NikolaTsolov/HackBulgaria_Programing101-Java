package week1Problems;

import java.util.Scanner;

public class ReverseAString {
	
	public static String reverseMe(String input){
		String res = new StringBuilder(input).reverse().toString();
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(reverseMe(input));
		
		sc.close();
	}

}
