package sort;

public class InsertionSort {
	public void insertSort(int[] array) {
		if (array.length < 2) {
			return;
		}
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (temp < array[j]) {
					array[j + 1] = array[j];
				} else {
					break;
				}
			}
			array[j + 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		InsertionSort iSort = new InsertionSort();
		int[] a = new int[]{49,38,65,97,76,13,27,49,78,34,12,64,1};
		iSort.insertSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

}
