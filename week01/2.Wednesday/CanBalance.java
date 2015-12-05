package week1Problems;

import java.util.Scanner;

public class CanBalance {
	public static boolean canBalance(int[] numbers){
		int sum = 0;
		int leftSum = 0;
		int rightSum;
		for(int i = 0; i < numbers.length;i++){	
			sum = sum + numbers[i];
		}
		int index = 0;
		while(index < numbers.length){
			leftSum = leftSum + numbers[index];
			rightSum = sum - leftSum;
			if(leftSum == rightSum){
				return true;
			}
			index+=1;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(canBalance(array));

		sc.close();
	}

}
