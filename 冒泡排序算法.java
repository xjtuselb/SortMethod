package 排序算法;

import java.util.Arrays;

public class 冒泡排序算法 {

	public static void main(String[] args) {
		int[] a = { -10, 21, 20, 38, 27, 1, 3, 6, 3, 1 };
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
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

}
