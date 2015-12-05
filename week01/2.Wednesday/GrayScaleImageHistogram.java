package week1Problems;

public class GrayScaleImageHistogram {

	public static int[] histogram(short[][] image) {
		int[] result = new int[256];
		int resIndex = 0;
		int counter = 0;
		while (resIndex < 256) {
			for (int i = 0; i < image.length; i++) {
				for (int j = 0; j < image.length; j++) {
					if (resIndex == image[i][j]) {
						counter++;
					}
				}
			}
			result[resIndex] = counter;
			resIndex++;
			counter = 0;
		}
		return result;
	}

	public static void main(String[] args) {
		short[][] image = new short[][] { { 255, 100, 200, 300 }, { 200, 100, 300, 1 }, { 255, 1, 0, 0 },
				{ 2, 3, 4, 5 } };

		int[] res = histogram(image);
		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d] = %d",i, res[i]);
			System.out.println();
		}
	}
}
