package 排序算法;

import java.util.Arrays;

public class 选择排序算法 {

	public static void main(String[] args) {
		int[] a = { 5, 6, 4, 6, 3, 5, 2, 7, 1 };
		System.out.println(Arrays.toString(a));
		selection_sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void selection_sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] >= a[j])
					min = j;
			}
			if (min != i)
				swap(a, min, i);
		}
	}

	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}
}
