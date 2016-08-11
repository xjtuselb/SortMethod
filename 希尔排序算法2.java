package 排序算法;

import java.util.Arrays;

public class 希尔排序算法2 {

	public static void main(String[] args) {
		int[] a = { 5, 3, 7, 3, 7, 32, 7, 4, 23, 12, 6, 8, 5, 3, 7, 3, 7 };
		System.out.println(Arrays.toString(a));
		shell_sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void shell_sort(int[] a) {
		for (int g = a.length / 2; g > 0; g /= 2) {
			for (int j = g; j < a.length; j++) {
				if (a[j] < a[j - g]) {
					int x = a[j], k = j - g;
					while (k >= 0 && a[k] > x) {
						a[k + g] = a[k];
						k -= g;
					}
					a[k + g] = x;
				}
			}
		}
	}

}
