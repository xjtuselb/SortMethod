package 排序算法utf8;

import java.util.Arrays;

public class 冒泡排序算法 {

	public static void main(String[] args) {
		int[] a = { -10, 21, 20, 38, 27, 1, 3, 6, 3, 1 };
		System.out.println(Arrays.toString(a));
		bubbleSort2(a);
		System.out.println(Arrays.toString(a));
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] ^ a[j];
					a[j] = a[i] ^ a[j];
					a[i] = a[i] ^ a[j];
				}
			}
		}
	}

	public static void bubbleSort2(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					a[j - 1] = a[j - 1] ^ a[j];
					a[j] = a[j - 1] ^ a[j];
					a[j - 1] = a[j - 1] ^ a[j];
				}
			}
		}
	}

}
