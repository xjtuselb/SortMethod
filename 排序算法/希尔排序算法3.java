package 排序算法;

import java.util.Arrays;

public class 希尔排序算法3 {

	public static void main(String[] args) {
		int[] a = { 5, 3, 7, 3, 7, 32, 7, 4, 23, 12, 6, 8, 5, 3, 7, 3, 7 };
		System.out.println(Arrays.toString(a));
		shell_sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void shell_sort(int[] a) {
		for (int g = a.length / 2; g > 0; g /= 2)
			for (int i = g; i < a.length; i++)
				for (int j = i - g; j >= 0 && a[j] > a[j + g]; j -= g)
					swap(a, j, j + g);
	}

	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}
}
