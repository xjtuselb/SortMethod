package 排序算法;

import java.util.Arrays;

public class 希尔排序算法 {

	public static void main(String[] args) {
		int[] a = { 5, 3, 7, 3, 7, 32, 7, 4, 23, 12, 6, 8 };
		System.out.println(Arrays.toString(a));
		shell_sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void shell_sort(int[] a) {
		// 分组
		for (int g = a.length / 2; g > 0; g /= 2) {
			// 对每个组进行操作
			for (int i = 0; i < g; i++) {
				// 组内操作，相当于直接插入排序的外层循环
				for (int j = i + g; j < a.length; j += g) {
					// 相邻的比较
					if (a[j] < a[j - g]) {
						int x = a[j];
						int k = j - g;
						while (k >= 0 && a[k] > x) {
							a[k + g] = a[k];
							k -= g;
						}
						a[k + g] = x;
					}
				} // 组内操作
			} // 组内
		} // 分组
	}

}
