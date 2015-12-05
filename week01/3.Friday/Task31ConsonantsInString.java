package week1Problems;

import java.util.Scanner;

public class Task31ConsonantsInString {
	
	public static int countConstants(String str){
		str = str.replaceAll("\\W+","");
		return str.trim().length() - Task30VowelsInString.countVowels(str); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(countConstants(input));
	
		sc.close();
	}

}
