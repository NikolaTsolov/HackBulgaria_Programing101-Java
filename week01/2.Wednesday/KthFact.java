package week1Problems;

import java.util.Scanner;

public class KthFact {
		public static long fact(long number){
			if(number == 1){
				return 1;
			}
			else{
				return number * fact(number - 1);
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number: ");
			long number = sc.nextInt();
			
			System.out.println("Facts: ");
			int numberOfFact = sc.nextInt();
			long res = number;
			for(int i = 0; i < numberOfFact;i++){
				res = fact(res);
			}
			
			System.out.println(res);
			sc.close();
		}
		

}
