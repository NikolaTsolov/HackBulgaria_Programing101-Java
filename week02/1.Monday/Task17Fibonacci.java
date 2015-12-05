import java.util.Scanner;

public class Task17Fibonacci {

	public static void fibonacci(int number) {
		if (number == 1) {
			System.out.print(1);
			return;
		} else {
			if (number == 2) {
				System.out.print(1);
				System.out.print(1);
				return;
			} else {
				System.out.print(1);
				System.out.print(1);
			}
		}
		int a = 1;
		int b = 1;
		int res = 0;
		for (int i = 2; i < number; i++) {
			res = a + b;
			System.out.print(res);
			int temp = b;
			b = res;
			a = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		while (number < 1) {
			System.err.println("Invalid input, try again! ");
			number = sc.nextInt();
		}

		fibonacci(number);

		sc.close();
	}

}
