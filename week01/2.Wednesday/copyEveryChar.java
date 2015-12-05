package week1Problems;

import java.util.Scanner;

public class copyEveryChar {

	public static void copy(String input, int number) {
		
		char[] inputToArray = input.toCharArray();
		for(int i = 0; i < inputToArray.length;i++){
			for(int j = 0; j < number; j++){
				System.out.print(inputToArray[i]);
			}
		}

		/*StringBuilder res = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < number; j++) {
				res.append(input.charAt(i));
			}
		}

		return res.toString();
		*/
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int numberOfTimes = sc.nextInt();
		
		copy(input, numberOfTimes);

//		System.out.println(copy(input, numberOfTimes));
		sc.close();

	}

}
