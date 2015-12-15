package monday;

import java.util.Scanner;

public class PowerFunction {

	public static <T extends Number> Number power(T number, int exponent) {
		Number result = 1;
		if (exponent == 0) {
			return 1;
		} else {
			while (exponent > 0) {
				result = result.doubleValue() * number.doubleValue();
				exponent--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		int exponent = sc.nextInt();
		
		System.out.println(power(base, exponent));

		sc.close();

	}

}
