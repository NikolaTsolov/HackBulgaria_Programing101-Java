package week1Problems;

import java.util.Scanner;

public class HasAnagram {

	public static boolean anagram(String A, String B) {
		if(B.contains(A)){
			return true;
		}
		return false ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings");
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		System.out.println(anagram(a, b));
		
		sc.close();
	}
}
