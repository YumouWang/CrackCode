package leetcode;

public class Median {
	public int getMedian(int[] numbers) {
		int num1 = numbers[0] - numbers[1];
		int num2 = numbers[2] - numbers[1];
		if (num1 > 0 && num2 > 0) {
			return numbers[0] < numbers[2] ? numbers[0] : numbers[2];
		} else if (num1 < 0 && num2 < 0) {
			return numbers[0] > numbers[2] ? numbers[0] : numbers[2];
		} else {
			return numbers[1];
		}
	}

	public int getMedian1(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers[1];
	}

	public static void main(String[] args) {
		Median m = new Median();
		int[] numbers1 = new int[] { 10, 30, 60 };
		int[] numbers2 = new int[] { 29, 7, 19 };
		int[] numbers3 = new int[] { 29, 7, 1 };
		int[] numbers4 = new int[] { 29, 100, 19 };
		System.out.println(m.getMedian(numbers1));
		System.out.println(m.getMedian(numbers2));
		System.out.println(m.getMedian(numbers3));
		System.out.println(m.getMedian(numbers4));

		System.out.println(m.getMedian1(numbers1));
		System.out.println(m.getMedian1(numbers2));
		System.out.println(m.getMedian1(numbers3));
		System.out.println(m.getMedian1(numbers4));
	}

}
