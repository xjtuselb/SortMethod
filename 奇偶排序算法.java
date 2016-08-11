package 排序算法;

import java.util.Arrays;

public class 奇偶排序算法 {

	public static void main(String[] args) {
		int[] a = { 9, 1, 5, 3, 4, 2, 6, 8, 7, 1, 5 };
		System.out.println(Arrays.toString(a));
		odd_even_sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void odd_even_sort(int[] a) {
		boolean flag = false;
		while (!flag) {
			// 循环结束条件
			flag = true;
			// 奇偶位控制
			for (int odd_even = 0; odd_even < 2; odd_even++)
				// 所有的奇数位||所有的偶数位
				for (int i = odd_even; i < a.length - 1; i += 2)
					// 所有奇数位和邻居比较
					if (a[i] > a[i + 1]) {
						swap(a, i, i + 1);
						// 循环继续条件
						flag = false;
					}
		}
	}

	private static void swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}

}
