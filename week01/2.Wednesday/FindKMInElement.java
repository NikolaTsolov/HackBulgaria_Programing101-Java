package week1Problems;

import java.util.Arrays;
import java.util.Scanner;

public class FindKMInElement {
	public static int kMin(int k, int[] arr){
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int helper = 1;
		int index = 1;
		while(helper < k && index < arr.length){
			if(arr[index - 1] != arr[index]){
				helper++;
				index++;
			}
			else{
				index++;
			}
		}
		return arr[index - 1];
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
		System.out.print("Enter k: ");
		int k = sc.nextInt();
		if(k < 0 || k > size){
			System.err.println("Invalid input for k !!!");
		}
		
		System.out.println(kMin(k, arr));
		
	}
}

