import java.util.Scanner;

public class Task18LucasSeries {

	public static int nthLucas(int n) {
		if (n == 0) {
			return 2;
		} else {
			if (n == 1) {
				return 1;
			} else {
				return nthLucas(n - 2) + nthLucas(n - 1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		while(number < 1){
			System.err.println("Invalid input, try again");
			number = sc.nextInt();
		}
		System.out.println(nthLucas(number));
		sc.close();
	}

}
