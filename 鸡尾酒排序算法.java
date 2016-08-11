package 排序算法;

import java.util.Arrays;

public class 鸡尾酒排序算法 {

	public static void main(String[] args) {
		int[] a = { 5, 6, 4, 6, 3, 5, 2, 7, 1 };
		System.out.println(Arrays.toString(a));
		cooktail_sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void cooktail_sort(int[] a) {
		int l = 0, r = a.length - 1;
		while (l < r) {
			for (int i = l; i < r; i++) {
				if (a[i] > a[i + 1])
					swap(a, i, i + 1);
			}
			r--;
			for (int j = r; j >= l; j--) {
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
			}
			l++;
		}
	}

	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}

}
