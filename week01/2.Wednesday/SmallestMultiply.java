package week1Problems;

import java.util.Scanner;

public class SmallestMultiply {
	
	public static long  getSmallestMultiple(int upperBound){
		int number = upperBound;
		for(int i = 2; i<upperBound; i++){
			if(number % i != 0){
				number = number * i;
			}
		}	
		return number;	
	}
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int upBound = sc.nextInt();
		System.out.println(getSmallestMultiple(upBound));
		sc.close();
	}

}
