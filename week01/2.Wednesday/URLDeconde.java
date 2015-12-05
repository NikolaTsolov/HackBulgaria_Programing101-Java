package week1Problems;

import java.util.Scanner;

public class URLDeconde {
	
	public static String decodeURL(String input){
			String res = input.replace("%20", "");
			res = res.replace("%3A", ":");
			res = res.replace("%3D", "?");
			res = res.replace("%2F", "/");
	
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(decodeURL(input));
		sc.close();
	}

}
