package week1Problems;

import java.util.Scanner;

public class IsOdd {
	
	public static boolean isOdd(int n){
		return n % 2 == 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		if(number == 0 || Character.isDigit(number)){
			System.err.println("Incorect Input");
			return;
		}
		
		System.out.println(isOdd(number));
	}

}
