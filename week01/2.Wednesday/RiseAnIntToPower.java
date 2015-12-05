package week1Problems;

import java.util.Scanner;

public class RiseAnIntToPower {
	public static int power(int a, int b){
		if(b == 0){
			return 1;
		}
		int powerOfHalfB = power(a, b/2);
		if(b % 2 == 1){
			return a * powerOfHalfB * powerOfHalfB;
		}
		else{
			return powerOfHalfB * powerOfHalfB;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(power(a,b));
		
		sc.close();
	}
}
