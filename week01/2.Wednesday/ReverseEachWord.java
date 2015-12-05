package week1Problems;

import java.util.Scanner;

public class ReverseEachWord {
	public static String reverseMe(String input){
		String res = new StringBuilder(input).reverse().toString();
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] inputToArray = input.split(" ");
		
		for(String el:inputToArray){
			System.out.print(reverseMe(el) + " ");
		}
		
		sc.close();
	}

}
