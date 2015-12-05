package week1Problems;

import java.util.Scanner;

public class GetOddOccurance {
	public static int getOddOccurrence (int[] arr){
		int res = 0;
		int counter = 0;
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr.length;j++){
				if(arr[i] == arr[j]){
					counter++;
				}
			}
			if(counter % 2 != 0){
				res = arr[i];
				counter = 0;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(getOddOccurrence(arr));
		
		sc.close();
	}

}
