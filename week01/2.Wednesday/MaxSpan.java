package week1Problems;

import java.util.Scanner;

public class MaxSpan {
	
	public static int maxSpan(int[] arr){
		int size = arr.length - 1;
		int counter = 0;
		int index = 0;
		for(int i = 0; i < arr.length;i++){
			while((arr[i] != arr[size - index]) && (size - index) > i){
				index++;
			}
			if((size - index) > i && (counter < (size - index))){
				counter = (size - index)  - i + 1;
				index = 0;
			}
			
			
		}
		return Math.abs(counter);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i = 0; i<size;i++){
			array[i] = sc.nextInt();
		}
		System.out.println(maxSpan(array));
		sc.close();
	}

}
