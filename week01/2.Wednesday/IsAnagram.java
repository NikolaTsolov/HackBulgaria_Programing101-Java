package week1Problems;

import java.util.Scanner;

public class IsAnagram {
	
	public static boolean anagram(String a, String b){
		char[] str1 = a.toCharArray();
		char[] str2 = b.toCharArray();
		boolean chek = false;
		
		for(int i = 0; i<str1.length;i++){
			chek = false;
			for(int j = 0; j<str2.length;j++){
				if(str1[i] == str2[j]){
					chek  = true;
					break;
				}
			}
			if(!chek){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings");
		String a = sc.nextLine();
		String b = sc.nextLine();
		if(a.length() > b.length()){
			System.err.println("ERROR");
		}

		System.out.println(anagram(a, b));

		sc.close();
	}
}
