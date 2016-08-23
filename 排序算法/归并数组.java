package 排序算法;

import java.util.Arrays;

public class 归并数组 {

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		int[] b = { 12, 11, 10, 9, 8, 7, 6 };
		int[] c = new int[12];
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		merge_array(a, b, c);
		System.out.println(Arrays.toString(c));
	}

	private static void merge_array(int[] a, int[] b, int[] c) {
		int i, j, k;
		i = j = k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}

		while (i < a.length)
			c[k++] = a[i++];
		while (j < b.length)
			c[k++] = b[j++];
	}

}
