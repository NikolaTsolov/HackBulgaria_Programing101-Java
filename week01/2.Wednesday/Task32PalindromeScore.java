package week1Problems;

import java.util.Scanner;

public class Task32PalindromeScore {
	
	public static int reverseNumber(int number){
		int helper = 0;
		int rev = 0;
		while(number != 0){
			helper = number % 10;
			number = number / 10;
			rev*=10;
			rev = rev + helper;
		}
		return rev;
	}
	
	public static int pScore(int number){
		if(number == reverseNumber(number)){
			return 1;
		}
		else{
			return 1 + pScore(number + reverseNumber(number));
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(pScore(number));
	
		sc.close();
	}

}
