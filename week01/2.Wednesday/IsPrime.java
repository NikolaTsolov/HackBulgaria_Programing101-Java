package week1Problems;

import java.util.Scanner;

public class IsPrime {
	public static boolean isPrime(int number){
		for(int i = 2; i<Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		if(number == 0 || Character.isDigit(number)){
			System.err.println("Indorect input");
			return;
		}
		
		System.out.println(isPrime(number));
	}

}
