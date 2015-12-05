package week1Problems;

import java.util.Scanner;

public class GetAverage {
	public static int findAvrg(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length;i++){
			sum = sum + arr[i];
		}
		return sum / arr.length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		while(size <= 0){
			System.err.println("Incorect input, try again ");
			size = sc.nextInt();
		}
		System.out.println();
		int[]arr = new int[size];
		for(int i = 0; i<size;i++){
			arr[i] = sc.nextInt();
		}		
		System.out.println("The avrg is: " + findAvrg(arr));	
	}
}
