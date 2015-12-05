import java.util.Scanner;

public class Task19Sequences {

	public static boolean isIncreasing(int[] seq) {
		for (int i = 0; i < seq.length - 1; i++) {
			if (!(seq[i] < seq[i + 1])) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDecreasing(int[] seq) {
		for (int i = 0; i < seq.length - 1; i++) {
			if (!(seq[i] > seq[i + 1])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while (size < 1) {
			System.err.println("Invalid Input, try again !");
			size = sc.nextInt();
		}
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(isIncreasing(arr));

		sc.close();
	}
}
