package week1Problems;

import java.util.Scanner;

public class FindMinElement {
	public static int min(int[] arr){
		int minEl = arr[0];
		for(int i =0; i<arr.length;i++){
			if(arr[i] < minEl){
				minEl = arr[i];
			}
		}
		return minEl;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size <= 0){
			System.err.println("Incorect input");
			return; 
		}
		System.out.println();
		int[]arr = new int[size];
		for(int i = 0; i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(min(arr));
		sc.close();
	}

}
