package week1Problems;

import java.util.Scanner;

public class ChekForPalindromeLengtht{
	
	public static int getPalindromeLength(String input){
		
		char[] helper = input.toCharArray();
		int index = 0;
		for(int i = 0; i<input.length();i++){
			if(helper[i] == '*'){
				index = i;
			}
		}
		int i = 1;
		int counter = 0;
		while((index - i) > 0 && (index + i)<helper.length){
			if(helper[index + i] == helper[index - i]){
				counter++;
			}
			i++;	
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(getPalindromeLength(input));
		
		sc.close();
	}

}
