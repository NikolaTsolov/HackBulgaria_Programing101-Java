package week1Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MinimalScalarProduct {
	
	public static long makeTheResult(int[] a, int[]b){
		long res = 0;
		for(int i = 0; i < 3; i++){
			res = res + a[i] * b[i];
		}
		return res;
	}
	public static long maximalScalarSum(int[] a, int[] b){
		Arrays.sort(a);
		Arrays.sort(b);
		return makeTheResult(a, b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a = new int[3];
		int[]b = new int[3];
		
		System.out.println("a: ");
		for(int i = 0; i < 3; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("b:");
		for(int i = 0; i < 3; i++){
			b[i] = sc.nextInt();
		}
		
		System.out.println(maximalScalarSum(a, b));
		
		sc.close();
	}

}
