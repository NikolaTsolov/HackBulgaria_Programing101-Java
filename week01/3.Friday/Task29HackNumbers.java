package week1Problems;

import java.util.Scanner;

public class Task29HackNumbers {
	
	public static boolean isHack(int number){
		if(number % 2 == 0){
			return false;
		}
		String numberToBinary = Integer.toBinaryString(number); 
		int counter = 0;
		for(int i = 0; i < numberToBinary.length();i++){
			if(numberToBinary.charAt(i) == '1'){
				counter++;
			}
		}
		StringBuilder sb = new StringBuilder(numberToBinary);
		if(counter % 2 != 0 && numberToBinary.equals(sb.reverse().toString())){
			return true;
		}
		return false;
	}
	public static int nextHack(int number){
		int res = number + 1;
		while(!isHack(res)){
			res++;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(isHack(input));
		
		System.out.print("Enter number to calculate next Hack Number: ");
		int inputForNextHackNumber = sc.nextInt();
		
		System.out.println(nextHack(inputForNextHackNumber));
		
		sc.close();
	}
}
