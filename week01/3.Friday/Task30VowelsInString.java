package week1Problems;

import java.util.HashMap;
import java.util.Scanner;

public class Task30VowelsInString {

	public static int countVowels(String str){
		/*
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		
		int res = 0;
		for(int i = 0; i < vowels.length;i++){
			for(int j =0; j < str.length();j++){
				if(vowels[i] == Character.toLowerCase(str.charAt(j))){
					res++;
				}
			}
		}
		return res;
		*/
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		hm.put('y', 0);
		int res = 0;
		for(int i = 0; i<str.length();i++){
			if(hm.containsKey(Character.toLowerCase(str.charAt(i)))){
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(countVowels(input));
		sc.close();
	}
}
