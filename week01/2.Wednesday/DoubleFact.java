package week1Problems;

import java.util.Scanner;

public class DoubleFact {
	public static long fact(long number){
		if(number == 1){
			return 1;
		}
		else{
			return number * fact(number - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long number = sc.nextInt();
		
		System.out.println(fact(fact(number)));
		
		sc.close();
	}
}
