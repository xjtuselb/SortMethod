package 排序算法;

import java.util.Arrays;

public class 快速排序算法2 {

	public static void main(String[] args) {
		int[] a = { 5, 6, 4, 1, 6, 3, 5, 2, 7, 1 };
		System.out.println(Arrays.toString(a));
		quickSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void quick_sort(int[] a, int l, int r) {
		int i = l, j = r;
		if (l < r) {
			int x = a[l];
			while (i != j) {
				while (i < j && a[j] > x)
					j--;
				if (i < j)
					a[i++] = a[j];
				while (i < j && a[i] < x)
					i++;
				if (i < j)
					a[j--] = a[i];
			}
			a[i] = x;
			quick_sort(a, l, i - 1);
			quick_sort(a, i + 1, r);
		}
	}

	public static void quickSort(int[] a) {
		if (a.length > 0)
			quick_sort(a, 0, a.length - 1);
	}

}
