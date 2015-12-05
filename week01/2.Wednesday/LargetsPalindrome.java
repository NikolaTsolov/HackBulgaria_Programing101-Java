package week1Problems;

import java.util.Scanner;

public class LargetsPalindrome {
	
	public static boolean isPalindrome(int number){
		int reversedNumber = 0;
		int helper = 0;
		int helperNumber = number;
		while(helperNumber != 0){
			helper = helperNumber % 10;
			reversedNumber*=10;
			reversedNumber = reversedNumber + helper;
			helperNumber/=10;
		}
		if(reversedNumber == number){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i = number; i > 0; i--){
			if(isPalindrome(i)){
				System.out.println("The largest palendrome is: " + i );
				return;
			}
		}
		sc.close();
	}
}
