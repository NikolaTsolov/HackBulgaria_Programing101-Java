package week1Problems;

public class Task33SMS {

	public static StringBuilder numbersToMessage(int[] arr) {
		char[] letters = { ' ', '0', 'a', 'd', 'g', 'j', 'm', 'p', 't', 'w' };
		StringBuilder res = new StringBuilder();
		int counter = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			counter = 0;
			flag = false;
			if (arr[i] == 1) {
				flag = true;
				i++;
			}
			while (i < arr.length - 1) {
				if (arr[i] == -1) {
					counter = 0;
					i++;
				}
				if (arr[i] == arr[i + 1]) {
					counter++;
					i++;
				} else {
					break;
				}
			}
			int x = 0;
			if (counter > 2 && arr[i] != 7) {
				counter = 0;
			} else {
				if (counter > 3 && arr[i] == 7) {
					counter = 0;
				}
			}
			if (flag) {
				x = letters[arr[i]] + counter;
				res.append(Character.toUpperCase((char) x));
			} else {
				x = letters[arr[i]] + counter;
				res.append((char) x);
			}
		}
		return res;
	}

	// public static int[] messageToNumbers(String message){
	//
	//
	// }

	public static void main(String[] args) {
		int[] arr = { 1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2 };
		System.out.println(numbersToMessage(arr));
	}
}
