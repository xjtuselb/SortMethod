package 排序算法;

import java.util.Arrays;

public class 直接插入排序算法 {

	public static void main(String[] args) {
		int[] a = { 6, 4, 7, 4, 73, 8, 23 };
		System.out.println(Arrays.toString(a));
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				int x = a[i], k = i - 1;
				for (int j = k; j >= 0 && a[j] > x; j--) {
					a[j + 1] = a[j];
					k--;
				}
				a[k + 1] = x;
			}
		}
	}
}
